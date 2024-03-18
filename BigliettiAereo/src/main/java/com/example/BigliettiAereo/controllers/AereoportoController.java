package com.example.BigliettiAereo.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.BigliettiAereo.entities.AereoportoEntity;
import com.example.BigliettiAereo.services.AereoportoService;
@CrossOrigin("http://localhost:8082/")
@RestController
public class AereoportoController {
	
	@Autowired
	AereoportoService service;
		
	@GetMapping("/aereoporti")
	public List<AereoportoEntity> getAllAereporti(){
		return service.getAllAereporti();
	}
	
	@GetMapping("/aereoporto/{id}")
	public Optional<AereoportoEntity> getAereoportoById(@PathVariable("id")Long id){
		return service.getAereoportoById(id);
	}
	
	@Transactional
	@PostMapping("/aereoporto/insert")
	public void updateAereoportoById(@RequestBody AereoportoEntity aereoporto){
		System.out.println(aereoporto);
		service.updateAereoportoById(aereoporto);
	}
	
	@Transactional
	@DeleteMapping("/aereoporto/delete/{id}")
	public void deleteAereoportoById(@PathVariable("id") Long id) {
		service.deleteAereoportoById(id);
	}

}
