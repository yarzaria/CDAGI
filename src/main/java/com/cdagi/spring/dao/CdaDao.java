package com.cdagi.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.cdagi.spring.entities.Cda;

@RestResource(path="cdacs",rel="cdacs")
public interface CdaDao extends CrudRepository<Cda, Long>{
	
     List<Cda> findAll();
     
     Cda findByAadhar(String aadhar);
}
