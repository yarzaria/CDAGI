package com.naturalprogrammer.spring.tutorial.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.naturalprogrammer.spring.tutorial.entities.Cda;

public interface CdaDao extends CrudRepository<Cda, Long>{
	
     List<Cda> findAll();
     
     Cda findByAadhar(String aadhar);
}
