package com.virtualdent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtualdent.entity.Dentist;
import com.virtualdent.service.DentistService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private DentistService dentistService;
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		List<Dentist>dentists=dentistService.getDentists();
		model.addAttribute("dentists",dentists);
		return "patient-home";
	}
	
	@RequestMapping("/showForm")
	public String showForm(@RequestParam int id,Model model)
	{
		Dentist dentist=dentistService.getDentist(id);
		model.addAttribute("dentist",dentist);
		return "";
	}

}