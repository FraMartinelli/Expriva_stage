package com.example.BigliettiAereo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BigliettiAereo.entities.VoloEntity;


@Repository
public interface VoloRepo extends JpaRepository<VoloEntity, Long> {
	@Modifying
	@Query(nativeQuery = true, value = "INSERT INTO volo (id_volo, id_aereoporto_origine, id_aereoporto_destinazione, " +
	        "id_aereoporto_scalo, id_aereo, posti_prenotati, posti_disponibili, costo_base) " +
	        "VALUES (:idVolo, :idAereoportoOrigine, :idAereoportoDestinazione, " +
	        ":idAereoportoScalo, :idAereo, :postiPrenotati, :postiDisponibili, :costoBase)")
	void insertVolo(
	        @Param("idVolo") String idVolo,
	        @Param("idAereoportoOrigine") Long idAereoportoOrigine,
	        @Param("idAereoportoDestinazione") Long idAereoportoDestinazione,
	        @Param("idAereoportoScalo") Long idAereoportoScalo,
	        @Param("idAereo") Long idAereo,
	        @Param("postiPrenotati") int postiPrenotati,
	        @Param("postiDisponibili") int postiDisponibili,
	        @Param("costoBase") int costoBase
	);
}

