package com.example.BigliettiAereo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BigliettiAereo.entities.AereoportoEntity;

@Repository
public interface AereoportoRepo extends JpaRepository<AereoportoEntity, Long> {
	
	@Modifying
	@Query(nativeQuery = true, value = "INSERT INTO aereoporto (id_aereoporto, nome_aereoporto, città, piste, stato_città)"
			+ "select :idAereoporto, :nomeAereoporto, :città, :piste, :statoCittà")
	public void insertAereoporto(
			@Param("idAereoporto") Long idAereoporto,
			@Param("nomeAereoporto")String nomeAereoporto,
			@Param("città") String città,
			@Param("piste") String piste,
			@Param("statoCittà") String statoCittà
			
			
			);
}
