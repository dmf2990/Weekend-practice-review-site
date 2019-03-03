package org.dmf.weekendprojectreviewsite.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//entity - tags this as part of model
@Entity 
public class Gym {
	
	//id and gen. valu. use id Long as identifier 
	@Id
	@GeneratedValue //generating a numerical value for each gym we add -- ends with gym/1
	private Long id;
	private String name;
	private String address;
	
	@OneToMany (mappedBy = "gym")
	private Collection<Review> reviews;
	
	//JPA hook
	public Gym () {}
	
	public Gym(String name, String address) {
		this.name = name;
		this.address = address;
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

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return "gym [id=" + id + ", name=" + name + ", address=" + address;
	}
	
	
}
