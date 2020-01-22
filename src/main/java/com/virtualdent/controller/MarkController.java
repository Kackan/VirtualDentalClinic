package com.virtualdent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtualdent.entity.Dentist;
import com.virtualdent.entity.Mark;
import com.virtualdent.service.DentistService;
import com.virtualdent.service.MarkService;

@Controller
@RequestMapping("/mark")
public class MarkController {

	@Autowired
	private MarkService markService;
	
	@Autowired
	private DentistService dentistService;
	
	@GetMapping("/home")
	public String home(Model model)
	{
		List<Mark>marks=markService.getMarks();
		model.addAttribute("marks",marks);
		return "mark-home";
	}
	
	@RequestMapping("/chooseDentist")
	public String chooseDentist(Model model)
	{
		List<Dentist>dentists=dentistService.getDentists();
		model.addAttribute("dentists",dentists);
		return "dentist-to-comment";
	}
	
	@RequestMapping("/addComment")
	public String addComment(@RequestParam Integer id,Model model)
	{
		Mark mark=new Mark();
		Dentist dentist=dentistService.getDentist(id);
		
		model.addAttribute("dentist",dentist);
		model.addAttribute("mark",mark);
		return "comment-form";
	}
	
	@RequestMapping("/saveComment")
	public String saveComment(@RequestParam Integer id,@ModelAttribute("mark") Mark mark)
	{
		Dentist dentist=dentistService.getDentist(id);
		dentist.addComment(mark);
		markService.saveMark(mark);
		return "redirect:/mark/home";
	}
	
	
}
