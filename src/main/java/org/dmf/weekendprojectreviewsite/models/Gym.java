package org.dmf.weekendprojectreviewsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//entity - tags this as part of model
@Entity 
public class Gym {
	
	//id and gen. valu. use id Long as identifier 
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String address;
	private String review;
	
	//JPA hook
	public Gym () {}
	
	public Gym(String name, String address, String review) {
		this.name = name;
		this.address = address;
		this.review = review;
	}
	
	//getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getReview() {
		return review;
	}

	@Override
	public String toString() {
		return "gym [id=" + id + ", name=" + name + ", address=" + address + ", review=" + review + "]";
	}
	
	
}
