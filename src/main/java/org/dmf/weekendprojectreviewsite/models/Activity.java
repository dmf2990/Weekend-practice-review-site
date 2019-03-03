package org.dmf.weekendprojectreviewsite.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;



@Entity
public class Activity {
	
	private Long id;
	private String name;
	
	@ManyToMany
	private Collection<Gym> gyms;
	
	public Activity(String name, Gym ...gyms) {
		this.name = name;
		this.gyms = Arrays.asList(gyms);
	}
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Collection<Gym> getAvticity() {
		return gyms;
	}
	
	public void addGymToGyms(Gym gym) {
		gyms.add(gym);
	}
	
}
