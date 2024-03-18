package com.example.BigliettiAereo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BigliettiAereo.entities.UtenteEntity;


@Repository
public interface UtenteRepo extends JpaRepository<UtenteEntity, Long> {
    
	@Modifying
    @Query(nativeQuery = true, value = "INSERT INTO utente (id_cliente, email, password) " +
            "VALUES (:id_cliente, :email, :password)")
    void insertUtente(
    		@Param("id_cliente") Long idCliente,
            @Param("email") String email,
            @Param("password") String password
    );
	
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE utente SET "
    		+ "email = :email "
    		+ "password = :password) "
    		+ "WHERE id_cliente = :idCliente")
    void updateUtente(
            @Param("idCliente") Long idCliente,
            @Param("email") String email,
            @Param("password") String password
    );
}