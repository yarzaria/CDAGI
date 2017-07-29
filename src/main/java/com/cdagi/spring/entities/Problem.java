package com.cdagi.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Problem {
	
	@Id @GeneratedValue
	Long id;
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	String pdescription;
	
	public Problem() {
		
	}

	public Problem(String pdescription) {
		super();
		this.pdescription = pdescription;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
}
