package com.virtualdent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtualdent.entity.Dentist;
import com.virtualdent.entity.Patient;
import com.virtualdent.entity.Visit;
import com.virtualdent.service.DentistService;
import com.virtualdent.service.PatientService;
import com.virtualdent.service.VisitService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private DentistService dentistService;
	
	@Autowired
	private PatientService patientService;

	@Autowired
	private VisitService visitService;
	
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		List<Dentist>dentists=dentistService.getDentists();
		model.addAttribute("dentists",dentists);
		return "patient-home";
	}
	
	@RequestMapping("/showPatientForm")
	public String showForm(@RequestParam Integer id, Model model)
	{
		Dentist dentist=dentistService.getDentist(id);
		List<Visit>visits=dentist.getCurrentVisits();
		model.addAttribute("visits",visits);
		return "choose-visit-form";
	}
	
	@RequestMapping("/saveVisit")
	public String saveVisit(@RequestParam("visitId") Integer visitId,Model model)
	{
		Visit visit=visitService.getVisit(visitId);
		visitService.saveVisit(visit);
		model.addAttribute("patient",new Patient());
		model.addAttribute("visit",visit);
		return "patient-form";
	}
	
	
	@RequestMapping("/savePatient")
	public String savePatient(@RequestParam Integer visitId, @ModelAttribute("patient") Patient patient)
	{
		Visit visit=visitService.getVisit(visitId);
		patient.setId(7);
		patient.setVisitDay(visit);
		patientService.savePatient(patient);
		return "redirect:/patient/home";
	}	
}  