package com.example.BigliettiAereo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class ClienteEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "CLIENTE_SEQ", allocationSize = 1)
    @JsonIgnore
    private Long idCliente;

    private String nome;

    private String indirizzo;

    private Long numeroTelefono;

    private Integer eta;

    // Costruttori, getter, setter, ecc.

    public Long getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Long getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(Long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Integer getEta() {
        return this.eta;
    }

    public void setEta(Integer età) {
        this.eta = età;
    }

	@Override
	public String toString() {
		return "ClienteEntity [nome=" + nome + ", indirizzo=" + indirizzo + ", numeroTelefono=" + numeroTelefono
				+ ", eta=" + eta + "]";
	}
    
    

}

