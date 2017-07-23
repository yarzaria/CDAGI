package com.naturalprogrammer.spring.tutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naturalprogrammer.spring.tutorial.dao.CdaDao;
import com.naturalprogrammer.spring.tutorial.entities.Cda;
import com.naturalprogrammer.spring.tutorial.entities.Medication;
import com.naturalprogrammer.spring.tutorial.entities.Problem;
import com.naturalprogrammer.spring.tutorial.entities.Socialhistory;
import com.naturalprogrammer.spring.tutorial.entities.Treatment;

@SpringBootApplication
public class NpSpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpSpringTutorialApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
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
		//treatment.add(new Treatment("Ravi", "BGS", "23-07-2017", problems, socialhistory, medication));
		
		
		Cda cds = new Cda("007", "Sunil", "Male", "20-06-1995", "9898989898", "BGS Banaglore", treatment);
		cdaDao.save(cds);

	}
	
	@Autowired
	CdaDao cdaDao;
	
	
	
	
}
