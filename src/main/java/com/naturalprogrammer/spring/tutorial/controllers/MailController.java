package com.naturalprogrammer.spring.tutorial.controllers;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring.tutorial.mail.MailSender;
import com.naturalprogrammer.spring.tutorial.dao.CdaDao;
import com.naturalprogrammer.spring.tutorial.entities.Cda;

@RestController
public class MailController {

	@Resource
	private MailSender smtpMailSender;
	
	@RequestMapping("/mail")
	public String sendMail() {
		
		smtpMailSender.send("abc@example.com", "Some subject", "the content");
		
		return "Mail sent";
	}
	
	@Autowired
	CdaDao cdaDao;
	
	
	
	@RequestMapping("/CDAC/{aid}")
	public Cda getCDAC(@PathVariable String aid) {
		
		return cdaDao.findByAadhar(aid);
	}
}
