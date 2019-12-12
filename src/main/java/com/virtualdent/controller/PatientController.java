package com.virtualdent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtualdent.entity.Dentist;
import com.virtualdent.entity.Patient;
import com.virtualdent.service.DentistService;
import com.virtualdent.service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private DentistService dentistService;
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		List<Dentist>dentists=dentistService.getDentists();
		model.addAttribute("dentists",dentists);
		return "patient-home";
	}
	
	@RequestMapping("/showForm")
	public String showForm(@RequestParam int id, Model model)
	{
		Dentist dentist=dentistService.getDentist(id);
		Patient patient=new Patient();
		model.addAttribute("patient",patient);
		model.addAttribute("dentist",dentist);
		return "save-form";
	}
	
	@PostMapping("/savePatient")
	public String savePatient(@RequestParam int id,@ModelAttribute("patient") Patient patient)
	{
		Dentist dentist=dentistService.getDentist(id);
		dentist.addPatient(patient);
		patientService.savePatient(patient);
		return "redirect:/patient/home";
	}

}