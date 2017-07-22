package com.naturalprogrammer.spring.tutorial.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



public class Treatment {

	String author;
	String place;
	String dateTime;
	List<String> problems;
	List<String> socialHistory;
	List<String> medication;
	
	public Treatment() {
		
	}
	
	public Treatment(String author, String place, String dateTime, List<String> problems, List<String> socialHistory,
			List<String> medication) {
		super();
		this.author = author;
		this.place = place;
		this.dateTime = dateTime;
		this.problems = problems;
		this.socialHistory = socialHistory;
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
	public List<String> getProblems() {
		return problems;
	}
	public void setProblems(List<String> problems) {
		this.problems = problems;
	}
	public List<String> getSocialHistory() {
		return socialHistory;
	}
	public void setSocialHistory(List<String> socialHistory) {
		this.socialHistory = socialHistory;
	}
	public List<String> getMedication() {
		return medication;
	}
	public void setMedication(List<String> medication) {
		this.medication = medication;
	}
	
	
}
