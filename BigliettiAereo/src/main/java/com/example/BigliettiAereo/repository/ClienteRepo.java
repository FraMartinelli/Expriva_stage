package com.example.BigliettiAereo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BigliettiAereo.entities.ClienteEntity;

@Repository
public interface ClienteRepo extends JpaRepository<ClienteEntity, Long>{
	
	 @Modifying
	    @Query(nativeQuery = true, value = "INSERT INTO cliente (nome, indirizzo, numerotelefono, eta) VALUES (:nome, :indirizzo, :numeroTelefono, :eta)")
	    void insertCliente(
	            @Param("nome") String nome,
	            @Param("indirizzo") String indirizzo,
	            @Param("numeroTelefono") Long numeroTelefono,
	            @Param("eta") Integer età
	    );
	
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE cliente SET "
			+ "nome = :nome"
			+ "indirizzo = :indirizzo"
			+ "numerotelefono = :numeroTelefono"
			+ "eta = :eta "
			+ "WHERE id_cliente = :idCliente")
	public void updateCliente(
			@Param("idCliente") Long idCliente,
			@Param("nome")String nome,
			@Param("indirizzo")String indirizzo,
			@Param("numeroTelefono")Long numeroTelefono,
			@Param("eta")Integer età);
	
	@Query(nativeQuery = true, value = "SELECT id_cliente FROM CLIENTE WHERE ROWNUM = 1 ORDER BY id_cliente DESC")
	public Long findLastIdCliente();

}
