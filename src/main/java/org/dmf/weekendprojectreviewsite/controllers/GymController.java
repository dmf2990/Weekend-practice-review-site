package org.dmf.weekendprojectreviewsite.controllers;

import javax.annotation.Resource;

import org.dmf.weekendprojectreviewsite.repositories.GymRepository;
import org.dmf.weekendprojectreviewsite.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// telling spring this is a controller 
@Controller
public class GymController {
	
	
	//allowing us to access such repositories
	@Resource
	GymRepository gyms;
	@Resource
	ReviewRepository reviews;
	
	//root mapping
	@GetMapping ("/")
	public String home(Model model) {
		//model attribute method needs a name and collection... which is provided here
		model.addAttribute("gyms", gyms.findAll());
		return "home";
	}
}
