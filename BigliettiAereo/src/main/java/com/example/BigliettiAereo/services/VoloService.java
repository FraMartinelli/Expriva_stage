package com.example.BigliettiAereo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.BigliettiAereo.entities.VoloEntity;
import com.example.BigliettiAereo.repository.VoloRepo;


@Service
public class VoloService {
	
	 @Autowired
	    VoloRepo repo;
	        
	    public List<VoloEntity> getAllVoli(){
	        return repo.findAll();
	    }
	        
	    public Optional<VoloEntity> getVoloById(Long id){
	        return repo.findById(id);
	    }
	    
	    public void insertVolo(VoloEntity volo) {
	        repo.save(volo);
	    }

}
