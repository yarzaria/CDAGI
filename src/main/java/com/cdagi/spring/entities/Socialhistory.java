package com.cdagi.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Socialhistory {
	
	@Id @GeneratedValue
	Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Socialhistory() {
		
	}
	
	public Socialhistory(String sdescription) {
		super();
		this.sdescription = sdescription;
	}

	String sdescription;

	public String getSdescription() {
		return sdescription;
	}

	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}
}
