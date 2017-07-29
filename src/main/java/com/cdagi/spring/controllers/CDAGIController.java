package com.cdagi.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdagi.spring.dao.CdaDao;
import com.cdagi.spring.entities.Cda;

@RestController
public class CDAGIController {

	@Autowired
	CdaDao cdaDao;
	
	
	
	@RequestMapping("/CDAC/{aid}")
	public Cda getCDAC(@PathVariable String aid) {
		
		return cdaDao.findByAadhar(aid);
	}
}
