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

@Controller
@RequestMapping("/dentist")
public class DentistController {
	
	@Autowired
	private DentistService service;
	
	
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
	
	@GetMapping("/showVisitForm")
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
	
}