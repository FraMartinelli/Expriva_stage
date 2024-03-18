package com.example.BigliettiAereo.dto;

public class RegistrationRequestDTO {

	private String email;

	private String password;

	private String nome;

	private String indirizzo;

	private Long numeroTelefono;

	private Integer eta;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Long getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(Long numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

}
