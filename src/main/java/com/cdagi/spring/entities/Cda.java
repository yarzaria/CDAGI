package com.cdagi.spring.entities;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@Entity
public class Cda {

	
	@Id @GeneratedValue
	Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	String aadhar;
	String name;
	String gender;
	String dob;
	String contactNo;
	String author;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cdaId")
	Set<Treatment> treatment;
	
	public Set<Treatment> getTreatment() {
		return treatment;
	}

	public void setTreatment(Set<Treatment> treatment) {
		this.treatment = treatment;
	}

	public Cda() {
		
	}
	
	public Cda(String aadhar, String name, String gender, String dob, String contactNo, String author,
			Set<Treatment> treatment) {
		super();
		this.aadhar = aadhar;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.contactNo = contactNo;
		this.author = author;
		this.treatment = treatment;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
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
