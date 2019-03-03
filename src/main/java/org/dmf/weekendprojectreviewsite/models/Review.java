package org.dmf.weekendprojectreviewsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Lob
	private String review;
	
	@ManyToOne
	private Gym gym;
	
	public Review() {}
	
	public Review(String review, Gym gym) {
		this.review = review;
		this.gym = gym;
	}

	public Long getId() {
		return id;
	}

	public String getReview() {
		return review;
	}
	

}


