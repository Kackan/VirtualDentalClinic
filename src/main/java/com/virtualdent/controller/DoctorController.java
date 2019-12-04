package com.virtualdent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtualdent.entity.Doctor;
import com.virtualdent.entity.DoctorDetails;
import com.virtualdent.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService service;
	
	
	@GetMapping("/home")
	public String homePage(Model model)
	{
		List<Doctor>doctors=service.getDoctors();
		model.addAttribute("doctors",doctors);
		return "home-page";
	}
	
	@GetMapping("/add")
	public String addDoctor(Model model)
	{
		model.addAttribute("doctor",new Doctor());
		model.addAttribute("doctorDetails",new DoctorDetails());
		return "doctor-form";
	}
	
	@PostMapping("/save")
	public String saveDoctor(@ModelAttribute("doctor")Doctor doctor)
	{
		service.saveDoctor(doctor);
		return "redirect/doctor/home";
		
	}

}