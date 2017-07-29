package com.cdagi.spring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Treatment {

	@Id @GeneratedValue
	Long id;
	
	String author;
	
	String place;
	String dateTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="problemId")
	Set<Problem> problems;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="socialhistoryId")
	Set<Socialhistory> socialhistory;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="medicationId")
	Set<Medication> medication;
	
	public Treatment() {
		
	}
	
	public Treatment(String author, String place, String dateTime, Set<Problem> problems, Set<Socialhistory> socialHistory,
			Set<Medication> medication) {
		super();
		this.author = author;
		this.place = place;
		this.dateTime = dateTime;
		this.problems = problems;
		this.socialhistory = socialHistory;
		this.medication = medication;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Set<Problem> getProblems() {
		return problems;
	}
	public void setProblems(Set<Problem> problems) {
		this.problems = problems;
	}
	public Set<Socialhistory> getSocialHistory() {
		return socialhistory;
	}
	public void setSocialHistory(Set<Socialhistory> socialHistory) {
		this.socialhistory = socialHistory;
	}
	public Set<Medication> getMedication() {
		return medication;
	}
	public void setMedication(Set<Medication> medication) {
		this.medication = medication;
	}
	
	
}
