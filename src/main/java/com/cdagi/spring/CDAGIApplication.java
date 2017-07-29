package com.cdagi.spring;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cdagi.spring.dao.CdaDao;
import com.cdagi.spring.entities.Cda;
import com.cdagi.spring.entities.Medication;
import com.cdagi.spring.entities.Problem;
import com.cdagi.spring.entities.Socialhistory;
import com.cdagi.spring.entities.Treatment;

@SpringBootApplication
public class CDAGIApplication {

	/*
	 * CDA Generation and Integration for Health
		Information Exchange Based on Cloud
		Computing System
	 * 
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(CDAGIApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		/*
		 * Initial Data
		 */
		Set<Treatment> treatment = new HashSet<Treatment>();
		Set<Problem> problems = new HashSet<Problem>();
		problems.add(new Problem("Cough"));
		problems.add(new Problem("Fever"));
		problems.add(new Problem("Cold"));
		
		
		Set<Socialhistory> socialhistory = new HashSet<Socialhistory>();
		socialhistory.add(new Socialhistory("Smoking"));
		socialhistory.add(new Socialhistory("Drinking"));
		
		
		Set<Medication> medication = new HashSet<Medication>();
		medication.add(new Medication("Medimol 625"));
		medication.add(new Medication("Cold Act 500"));
		
		treatment.add(new Treatment("Ravi", "BGS", "23-07-2017", problems, socialhistory, medication));
		
		
		Cda cds = new Cda("007", "Sunil", "Male", "20-06-1995", "9898989898", "BGS Banaglore", treatment);
		cdaDao.save(cds);

	}
	
	@Autowired
	CdaDao cdaDao;
	
	
	
	
}
