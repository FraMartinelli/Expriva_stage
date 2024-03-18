package com.example.BigliettiAereo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPAGNIAAEREA")

public class CompagniaaereaEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompagnia;

    private String nomeCompagnia;

    private String sedeCompagnia;

    // Costruttori, getter, setter, ecc.

    public Long getIdCompagnia() {
        return idCompagnia;
    }

    public void setIdCompagnia(Long idCompagnia) {
        this.idCompagnia = idCompagnia;
    }

    public String getNomeCompagnia() {
        return nomeCompagnia;
    }

    public void setNomeCompagnia(String nomeCompagnia) {
        this.nomeCompagnia = nomeCompagnia;
    }

    public String getSedeCompagnia() {
        return sedeCompagnia;
    }

    public void setSedeCompagnia(String sedeCompagnia) {
        this.sedeCompagnia = sedeCompagnia;
    }

	@Override
	public String toString() {
		return "CompagniaaereaEntity [idCompagnia=" + idCompagnia + ", nomeCompagnia=" + nomeCompagnia
				+ ", sedeCompagnia=" + sedeCompagnia + "]";
	}
    
    
}



