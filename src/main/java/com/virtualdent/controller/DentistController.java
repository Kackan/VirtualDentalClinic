package com.virtualdent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String saveDentist(@ModelAttribute("dentist")Dentist dentist)
	{
		service.saveDentist(dentist);
		return "redirect:/dentist/home";		
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
	public String deleteVisit(@RequestParam("id")Integer id,@RequestParam("dentistId")Integer dentistId, Model model)
	{
		Dentist dentist=service.getDentist(dentistId);
		System.out.println(dentist.getVisits());
		
		Visit v=visitService.getVisit(id);
		System.out.println(v.toString());
		visitService.deleteVisit(id);
		model.addAttribute("dentist",dentist);
		model.addAttribute("visit",v);
		return "visit-delete";
	}
}