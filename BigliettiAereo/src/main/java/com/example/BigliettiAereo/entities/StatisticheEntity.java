package com.example.BigliettiAereo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "STATISTICHE")
public class StatisticheEntity {

    @Id
    @OneToOne
    @JoinColumn(name = "id_volo")
    private VoloEntity volo;

    private Integer numPrenotazioni;

    private Integer etaMediaPasseggeri;

    private Integer numAdulti;

    private Integer numBambini;

    private BigDecimal totEuroFatturato;

    // Costruttori, getter, setter, ecc.
    public VoloEntity getVolo() {
        return volo;
    }

    public void setVolo(VoloEntity volo) {
        this.volo = volo;
    }

    public Integer getNumPrenotazioni() {
        return numPrenotazioni;
    }

    public void setNumPrenotazioni(Integer numPrenotazioni) {
        this.numPrenotazioni = numPrenotazioni;
    }

    public Integer getEtaMediaPasseggeri() {
        return etaMediaPasseggeri;
    }

    public void setEtaMediaPasseggeri(Integer etaMediaPasseggeri) {
        this.etaMediaPasseggeri = etaMediaPasseggeri;
    }

    public Integer getNumAdulti() {
        return numAdulti;
    }

    public void setNumAdulti(Integer numAdulti) {
        this.numAdulti = numAdulti;
    }

    public Integer getNumBambini() {
        return numBambini;
    }

    public void setNumBambini(Integer numBambini) {
        this.numBambini = numBambini;
    }

    public BigDecimal getTotEuroFatturato() {
        return totEuroFatturato;
    }

    public void setTotEuroFatturato(BigDecimal totEuroFatturato) {
        this.totEuroFatturato = totEuroFatturato;
    }
}