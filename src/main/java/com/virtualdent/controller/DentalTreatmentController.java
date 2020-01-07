package com.virtualdent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtualdent.entity.DentalTreatment;
import com.virtualdent.service.DentalTreatmentService;

@Controller
@RequestMapping("/dentalTreatment")
public class DentalTreatmentController {
	
	@Autowired
	DentalTreatmentService service;
	
	@GetMapping("/home")
	public String getDentalTreatments(Model model)
	{
		DentalTreatment treatment=service.getDentalTreatment();
		model.addAttribute("treatment",treatment);
		return "dentaltreatments-home";
	}
	
	@RequestMapping("/result")
	public String getResults(@ModelAttribute("treatment")DentalTreatment dt, Model model)
	{
		Double sum=service.counter(dt.getChosen());
		
		model.addAttribute("sum",sum);
		return "dentaltreatments-result";
	}

}