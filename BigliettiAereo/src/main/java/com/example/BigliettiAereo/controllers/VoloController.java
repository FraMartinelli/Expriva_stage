package com.example.BigliettiAereo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.BigliettiAereo.entities.VoloEntity;
import com.example.BigliettiAereo.services.VoloService;


public class VoloController {
	
	@Autowired 
	VoloService service;
	
	 @GetMapping("/voli")
     public List<VoloEntity> getAllVoli(){
             return service.getAllVoli();
     }
     
     @GetMapping("/volo/{id}")
     public Optional<VoloEntity> getVoloById(@PathVariable("id") Long id){
             return service.getVoloById(id);
     }
 
}
