package org.dmf.weekendprojectreviewsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	private String review;
	
	public Review() {}
	
	public Review(Long id, String review) {
		this.id = id;
		this.review = review;
	}

	public Long getId() {
		return id;
	}

	public String getReview() {
		return review;
	}
	

}


