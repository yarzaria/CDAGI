package com.naturalprogrammer.spring.tutorial.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring.tutorial.mail.MailSender;
import com.naturalprogrammer.spring.tutorial.mail.SmtpMailSender;

import com.naturalprogrammer.spring.tutorial.entities.Treatment;
import com.naturalprogrammer.spring.tutorial.entities.CDA;

@Controller
public class MailController {

	@Resource
	private MailSender smtpMailSender;
	
	@RequestMapping("/mail")
	public String sendMail() {
		
		smtpMailSender.send("abc@example.com", "Some subject", "the content");
		
		return "Mail sent";
	}
	
	private CDA cds;
	
	
	@PostConstruct
	public void init() {
		
		Set<Treatment> treatment = new HashSet<Treatment>();
		List<String> problems = new ArrayList<String>();
		problems.add("Cough");
		problems.add("Fever");
		problems.add("Cold");
		
		
		List<String> socialhistory = new ArrayList<String>();
		socialhistory.add("Smoking");
		socialhistory.add("Drinking");
		
		
		List<String> medication = new ArrayList<String>();
		medication.add("Medimol 625");
		medication.add("Cold Act 500");
		
		treatment.add(new Treatment("Ravi", "BGS", "23-07-2017", problems, socialhistory, medication));
		
		
		cds = new CDA("007", "Sunil", "Male", "20-06-1995", "9898989898", "BGS Banaglore", treatment);

	}
	
	@RequestMapping("/getCDAC")
	public @ResponseBody CDA getCDAC() {
		
		return cds;
	}
}
