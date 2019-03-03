package org.dmf.weekendprojectreviewsite.controllers;

import javax.annotation.Resource;

import org.dmf.weekendprojectreviewsite.repositories.GymRepository;
import org.dmf.weekendprojectreviewsite.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GymController {
	@Resource
	GymRepository gyms;
	@Resource
	ReviewRepository reviews;

	//pathVariable -- tells us what gym (id) the user is looking at, and returning us the gymId
	// "gym" is linking th to java backend here. going into gym repo and finding specific gym by id. 
	// if returning a single item, you have to add .get() ... look for 
	@GetMapping("/{id}")
	public String individualGymPage(@PathVariable Long id, Model model) {
		model.addAttribute("gym", gyms.findById(id).get());
		return "review";
	}
}
