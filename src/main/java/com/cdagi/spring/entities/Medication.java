package com.cdagi.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medication {
	
	@Id @GeneratedValue
	Long id;
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Medication() {
		
	}

	public Medication(String mdescription) {
		super();
		this.mdescription = mdescription;
	}

	String mdescription;

	public String getMdescription() {
		return mdescription;
	}

	public void setMdescription(String mdescription) {
		this.mdescription = mdescription;
	}
}
