package com.example.BigliettiAereo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.BigliettiAereo.entities.CompagniaaereaEntity;
import com.example.BigliettiAereo.repository.CompagniaAereaRepo;



@Service
public class CompagniaAereaService {
                
        @Autowired
        CompagniaAereaRepo repo;
        
        Optional<CompagniaaereaEntity> entity = Optional.ofNullable(new CompagniaaereaEntity());
        
        public List<CompagniaaereaEntity> getAllCompagnie(){
                
                return repo.findAll();
        }
        
        public Optional<CompagniaaereaEntity> getCompagniaById(Long id){
                entity = repo.findById(id);
                System.out.println(entity);
                return entity;
        }
        
        public void updateCompagniaById(CompagniaaereaEntity compagniaAerea){
                Long idCompagnia = compagniaAerea.getIdCompagnia();
                String nomeCompagnia = compagniaAerea.getNomeCompagnia();
                String sede = compagniaAerea.getSedeCompagnia();
                repo.insertCompagniaAerea(idCompagnia, nomeCompagnia, sede);
        }
        
        public void deleteCompagniaById(@PathVariable("id") Long id) {
                repo.deleteById(id);
        }
        
}