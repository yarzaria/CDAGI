package com.naturalprogrammer.spring.tutorial.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.naturalprogrammer.spring.tutorial.entities.Cda;

@RestResource(path="cads",rel="cads")
public interface CdaDao extends CrudRepository<Cda, Long>{
	
     List<Cda> findAll();
     
     Cda findByAadhar(String aadhar);
}
