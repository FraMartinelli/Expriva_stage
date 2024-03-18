package com.example.BigliettiAereo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.BigliettiAereo.entities.ClienteEntity;
import com.example.BigliettiAereo.repository.ClienteRepo;

@Service
public class ClienteService {

	@Autowired
	ClienteRepo repo;
	
	Optional<ClienteEntity> entity = Optional.ofNullable(new ClienteEntity());
	
	public List<ClienteEntity> getAllClineti(){
		return repo.findAll();
	}
	
	public Optional<ClienteEntity> getClienteById(Long id){
		entity = repo.findById(id);
		System.out.println(entity);
		return entity;
	}
	
	@Transactional
	public void insertCliente(ClienteEntity cliente) {
		String nome = cliente.getNome();
		String indirizzo = cliente.getIndirizzo();
		Long numeroTelefono = cliente.getNumeroTelefono();
		Integer età = cliente.getEta();
		repo.insertCliente(nome, indirizzo, numeroTelefono, età);
	}
	
	@Transactional
	public void deleteClienteById(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
}
