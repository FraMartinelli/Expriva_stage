package com.example.BigliettiAereo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BigliettiAereo.dto.RegistrationRequestDTO;
import com.example.BigliettiAereo.entities.ClienteEntity;
import com.example.BigliettiAereo.entities.UtenteEntity;
import com.example.BigliettiAereo.services.ClienteService;
import com.example.BigliettiAereo.services.UtenteService;
@RestController
@CrossOrigin("http://localhost:4200")
public class RegistrationController {
        
    @Autowired
    UtenteService utenteService;
    
    @Autowired
    ClienteService clienteService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUserAndClient(@RequestBody RegistrationRequestDTO requestDTO) {
    	
    	ClienteEntity cliente = new ClienteEntity();
    	cliente.setNome(requestDTO.getNome());
    	cliente.setIndirizzo(requestDTO.getIndirizzo());
    	cliente.setEta(requestDTO.getEta());
    	cliente.setNumeroTelefono(requestDTO.getNumeroTelefono());
    	UtenteEntity utente = new UtenteEntity();
    	utente.setEmail(requestDTO.getEmail());
    	utente.setPassword(requestDTO.getPassword());
        try {  
            clienteService.insertCliente(cliente);
            utenteService.insertUtente(utente);
            return ResponseEntity.ok().body("{\"message\": \"Registrazione completata con successo\"}");
        } catch (Exception e) {
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"error\": \"Errore durante la registrazione: " + e.getMessage() + "\"}");
        }
    }
}