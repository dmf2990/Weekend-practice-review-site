package org.dmf.weekendprojectreviewsite.controllers;

import javax.annotation.Resource;

import org.dmf.weekendprojectreviewsite.models.Gym;
import org.dmf.weekendprojectreviewsite.models.Review;
import org.dmf.weekendprojectreviewsite.repositories.GymRepository;
import org.dmf.weekendprojectreviewsite.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubmitController {

	//allowing us to access such repositories
		@Resource
		GymRepository gyms;
		@Resource
		ReviewRepository reviews;
		
		//click submit a review on home page, returns page submit.html
		@GetMapping("/submit")
		public String submit() {
			return "submit";
		}
		
		//mixture of all variables in models to build a postSubmit- name and address from gym, review from review.
		//instantiate a gym and a review : line 32, 33
		//gyms.save(gymToMake) = after made gym and a review - now saving that gym (gymToMake) to GymRepository
		//39- now saving instance of review we created on 37 to review repository (includes instance of gym we made)
		
		@PostMapping("/submit")
		public String postSubmit (String name, String address, String review) {
			//if gym not already in repo, add it, otherwise access existing to add review.
			Gym gymToMake = gyms.findByNameAndAddress(name, address);
			if (gymToMake == null) {
				gymToMake = gyms.save(new Gym(name, address)); 
			}
			gymToMake = gyms.save(gymToMake);
			
			Review reviewToMake = new Review(review, gymToMake);
			gyms.save(gymToMake);
			reviews.save(reviewToMake);
			return "redirect:/";
		}
}
