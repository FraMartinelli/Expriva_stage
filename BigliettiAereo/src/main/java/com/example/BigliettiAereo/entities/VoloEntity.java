package com.example.BigliettiAereo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VOLO")
public class VoloEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_volo", nullable = false)
	private String idVolo;

	@Column(name = "id_aereoporto_origine")
	private Long idAereoportoOrigine;
	
	@Column(name = "id_aereoporto_destinazione")
	private Long idAereoportoDestinazione;
	
	@Column(name = "id_aereoporto_scalo")
	private Long idAereoportoScalo;
	
	@Column(name = "id_aereo", nullable = false)
	private Long idAereo;
	
	@Column(name = "posti_prenotati", nullable = false)
	private int postiPrenotati;
	
	@Column(name = "posti_disponibili", nullable = false)
	private int postiDisponibili;
	
	@Column(name = "costo_base", nullable = false)
	private int costoBase;

	// Costruttori, getter, setter, ecc.

	public String getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(String idVolo) {
		this.idVolo = idVolo;
	}

	public Long getAereoporto_origine() {
		return idAereoportoOrigine;
	}

	public void setAeroportoOrigine(Long aereoporto_origine) {
		this.idAereoportoOrigine = aereoporto_origine;
	}

	public Long getAeroporto_destinazione() {
		return idAereoportoDestinazione;
	}

	public void setAeroportoDestinazione(Long aereoporto_destinazione) {
		this.idAereoportoDestinazione = aereoporto_destinazione;
	}

	public Long getAeroporto_Scalo() {
		return idAereoportoScalo;
	}

	public void setAeroportoScalo(Long aereoporto_scalo) {
		this.idAereoportoScalo = aereoporto_scalo;
	}

	public Long getAereo() {
		return idAereo;
	}

	public void setAereo(Long idAereo) {
		this.idAereo = idAereo;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	public void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}

	public int getPostiDisponibili() {
		return postiDisponibili;
	}

	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}

	public Integer getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(Integer costoBase) {
		this.costoBase = costoBase;
	}
}
