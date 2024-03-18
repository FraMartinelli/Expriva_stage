package com.example.BigliettiAereo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AEREOPORTO")
public class AereoportoEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAereoporto;

    private String nomeAereoporto;

    private String città;

    private String piste;

    private String statoCittà;

    // Costruttori, getter, setter, ecc.

    public Long getIdAereoporto() {
        return idAereoporto;
    }

    public void setIdAereoporto(Long idAereoporto) {
        this.idAereoporto = idAereoporto;
    }

    public String getNomeAereoporto() {
        return nomeAereoporto;
    }

    public void setNomeAereoporto(String nomeAereoporto) {
        this.nomeAereoporto = nomeAereoporto;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getPiste() {
        return piste;
    }

    public void setPiste(String piste) {
        this.piste = piste;
    }

    public String getStatoCittà() {
        return statoCittà;
    }

    public void setStatoCittà(String statoCittà) {
        this.statoCittà = statoCittà;
    }

}

