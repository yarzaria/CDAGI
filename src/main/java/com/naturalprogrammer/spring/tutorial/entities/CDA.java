package com.naturalprogrammer.spring.tutorial.entities;

import java.util.Set;

public class CDA {

	String aadharId;
	String name;
	String gender;
	String dob;
	String contactNo;
	String author;
	
	Set<Treatment> treatment;
	
	public CDA() {
		
	}
	
	public CDA(String aadharId, String name, String gender, String dob, String contactNo, String author,
			Set<Treatment> treatment) {
		super();
		this.aadharId = aadharId;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.contactNo = contactNo;
		this.author = author;
		this.treatment = treatment;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
