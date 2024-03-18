package com.example.BigliettiAereo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BigliettiAereo.entities.CompagniaaereaEntity;

@Repository
public interface CompagniaAereaRepo extends JpaRepository<CompagniaaereaEntity, Long> {
	
	@Modifying
	@Query(nativeQuery = true, value = "INSERT INTO compagniaaerea (id_compagnia, nome_compagnia, sede_compagnia) " +
	        "VALUES (:idCompagnia, :nomeCompagnia, :sedeCompagnia)")
	void insertCompagniaAerea(
	        @Param("idCompagnia") Long idCompagnia,
	        @Param("nomeCompagnia") String nomeCompagnia,
	        @Param("sedeCompagnia") String sedeCompagnia
	);


}
