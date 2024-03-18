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

import com.example.BigliettiAereo.entities.ClienteEntity;
import com.example.BigliettiAereo.services.ClienteService;
@CrossOrigin("http://localhost:4200/")
@RestController
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	@GetMapping("/clienti")
	public List<ClienteEntity> getAllClineti(){
		return service.getAllClineti();
	}
	
	@GetMapping("/cliente/{id}")
	public Optional<ClienteEntity> getClienteById(@PathVariable("id") Long id){
		return service.getClienteById(id);
	}
	
	@PostMapping("/cliente/insert")
	public void insertCliente(@RequestBody ClienteEntity cliente){
		System.out.println(cliente);
		service.insertCliente(cliente);
	}
	
	@Transactional
	@DeleteMapping("/cliente/delete/{id}")
	public void deleteClienteById(@PathVariable("id") Long id) {
		service.deleteClienteById(id);
	}

}
