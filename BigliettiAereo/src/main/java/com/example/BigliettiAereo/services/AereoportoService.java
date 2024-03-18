package com.example.BigliettiAereo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.BigliettiAereo.entities.AereoportoEntity;
import com.example.BigliettiAereo.repository.AereoportoRepo;

@Service
public class AereoportoService {
	
	@Autowired
	AereoportoRepo repo;
	
	Optional<AereoportoEntity> entity = Optional.ofNullable(new AereoportoEntity());
	
	public List<AereoportoEntity> getAllAereporti(){
		return repo.findAll();
	}
	
	public Optional<AereoportoEntity> getAereoportoById(Long id){
		entity = repo.findById(id);
		System.out.println(entity);
		return entity;
	}
	
	public void updateAereoportoById(AereoportoEntity aereoporto){
		Long id = aereoporto.getIdAereoporto();
		String nome = aereoporto.getNomeAereoporto();
		String città = aereoporto.getCittà();
		String piste = aereoporto.getPiste();
		String statoCittà = aereoporto.getStatoCittà();
		repo.insertAereoporto(id, nome, città, piste, statoCittà);
	}
	
	public void deleteAereoportoById(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
}
