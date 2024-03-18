package com.example.BigliettiAereo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.BigliettiAereo.entities.ClienteEntity;
import com.example.BigliettiAereo.entities.UtenteEntity;
import com.example.BigliettiAereo.repository.ClienteRepo;
import com.example.BigliettiAereo.repository.UtenteRepo;



@Service
public class UtenteService {
        
    @Autowired
    UtenteRepo repo;
    
    @Autowired
    ClienteRepo clienteRepo;

    @Autowired
    ClienteService clienteService;
    
    public List<UtenteEntity> getAllUtenti(){
        return repo.findAll();
    }
    
    public Optional<UtenteEntity> getUtenteById(Long id){
        return repo.findById(id);
    }
    @Transactional
    public void insertUtente(UtenteEntity utente) {
    	
    	Long idCliente = clienteRepo.findLastIdCliente();
    	String email = utente.getEmail();
    	String password = utente.getPassword();
    	
        repo.insertUtente(idCliente, email, password);
    }
    
    @Transactional
    public void updateUtente(UtenteEntity utente) {
    	
    	Long idUtente= utente.getIdCliente();
    	String email = utente.getEmail();
    	String password = utente.getPassword();
        repo.updateUtente(idUtente, email, password);
    }
    @Transactional
    public void deleteUtenteById(Long id) {
        repo.deleteById(id);
    }

//    @Transactional
//    public void registerUserAndClient(UtenteEntity utente, ClienteEntity cliente) {
//        UtenteEntity savedUtente = repo.save(utente);
//        cliente.setIdCliente(savedUtente.getIdCliente()); 
//        clienteService.insertCliente(cliente); 
//    }
}
