package com.virtualdent.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtualdent.entity.Dentist;
import com.virtualdent.entity.Visit;
import com.virtualdent.service.DentistService;
import com.virtualdent.service.VisitService;

@Controller
@RequestMapping("/dentist")
public class DentistController {
	
	@Autowired
	private DentistService service;
	
	@Autowired
	private VisitService visitService;
	
	@GetMapping("/home")
	public String homePage(Model model)
	{
		List<Dentist>dentists=service.getDentists();
		model.addAttribute("dentists",dentists);
		return "dentist-home";
	}
	
	@GetMapping("/showForm")
	public String addDentist(Model model)
	{
		model.addAttribute("dentist",new Dentist());
		return "dentist-form";
	}
	
	@PostMapping("/save")
	public String saveDentist(@Valid @ModelAttribute("dentist")Dentist dentist, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return "redirect:/dentist/showForm";
		}
		else {
		service.saveDentist(dentist);
		return "redirect:/dentist/home";		
		}
	}
	
	@RequestMapping("/delete")
	public String deleteDentist(@RequestParam("id") Integer id)
	{
		service.deleteDentist(id);
		return "redirect:/dentist/home";
	}
	
	@RequestMapping("/edit")
	public String editDentist(@RequestParam("id") Integer id, Model model)
	{
		Dentist dentist=service.getDentist(id);
		model.addAttribute(dentist);
		return "dentist-edit-form";
	}
	
	@RequestMapping("/showVisitForm")
	public String showVisitForm(@RequestParam Integer id, Model model)
	{
		Dentist dentist=service.getDentist(id);
		model.addAttribute("dentist", dentist);
		model.addAttribute("visit",new Visit());
		return "visit-form";
	}
	
	@RequestMapping("/saveVisit")
	public String saveVisit(@RequestParam("id") Integer id, @ModelAttribute("visit") Visit visit)
	{
		Dentist dentist=service.getDentist(id);
		dentist.addVisit(visit);
		service.saveDentist(dentist);
		return "redirect:/dentist/home";
	}

	@RequestMapping("/deleteVisit")
	public String deleteVisit(@RequestParam Map<String,String>ids)
	{
		visitService.deleteVisit(ids.get("dentistId"), ids.get("visitId"));
		return "redirect:/dentist/home";
	}
	
	@RequestMapping("/saveEditedVisit")
	public String saveEditedVisit(@RequestParam("dentistId")Integer id,@ModelAttribute("visit") Visit visit)
	{
		Dentist dentist=service.getDentist(id);
		dentist.addVisit(visit);
		visitService.deleteVisit(Integer.toString(id), Integer.toString(visit.getId()));
		visitService.saveVisit(visit);
		//service.saveDentist(dentist);
		return "visit-result";
		
		//"xddredirect:/dentist/home";
	}
	
	@RequestMapping("/editVisit")
	public String editVisit(/*@RequestParam("idVisit") Integer id,*/@RequestParam Map<String,String>ids,Model model)
	{
		Map<String,Integer>map=visitService.editVisit(ids.get("idVisit"), ids.get("idDentist"));
		
		Visit visit=visitService.getVisit(map.get("visit"));
		model.addAttribute("dentist",map.get("dentist"));
		model.addAttribute("visit",visit);
		//visitService.deleteVisit(ids.get("idVisit"), ids.get("idDentist"));
		return "visit-edit-form";
	}
}