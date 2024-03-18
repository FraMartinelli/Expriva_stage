import { Component, OnInit } from '@angular/core';
import { prenotazioniService } from '../prenotazioniService.service';
import { Prenotazioni } from '../models/prenotazioni';

@Component({
  selector: 'app-prenotazioni',
  templateUrl: './prenotazioni.component.html',
  styleUrls: ['./prenotazioni.component.css']
})
export class prenotazioni implements OnInit {
  reservations: Prenotazioni[] = [];
  selectedReservation: Prenotazioni = { idPrenotazione: 0, idVolo: '', idCliente: 0, dataPrenotazione: new Date(), dataViaggio: new Date(), costoFatturato: 0, nomeGiorno: '' };
  showForm: boolean = false;

  // Definisci le colonne da visualizzare nella tabella
  displayedColumns: string[] = ['idPrenotazione', 'idVolo', 'idCliente', 'dataPrenotazione', 'dataViaggio', 'costoFatturato', 'nomeGiorno', 'actions'];

  constructor(private reservationService: prenotazioniService) {}

  ngOnInit(): void {
    this.getReservations();
  }

  getReservations(): void {
    this.reservationService.getReservations()
      .subscribe(reservations => this.reservations = reservations);
  }

  editReservation(reservation: Prenotazioni): void {
    this.selectedReservation = { ...reservation };
    this.showForm = true;
  }

  deleteReservation(id: number): void {
    this.reservationService.deleteReservation(id)
      .subscribe(() => {
        // Aggiorna la lista delle prenotazioni dopo l'eliminazione
        this.getReservations();
      });
  }

  submitForm(): void {
    if (this.selectedReservation.idPrenotazione === 0) {
      // Inserimento: Invia una richiesta HTTP POST per aggiungere una nuova prenotazione
      this.reservationService.addReservation(this.selectedReservation)
        .subscribe(() => {
          // Aggiorna la lista delle prenotazioni dopo l'inserimento
          this.getReservations();
          // Resettare selectedReservation per consentire nuovi inserimenti
          this.clearForm();
        });
    } else {
      // Aggiornamento: Invia una richiesta HTTP PUT per aggiornare la prenotazione esistente
      this.reservationService.updateReservation(this.selectedReservation)
        .subscribe(() => {
          // Aggiorna la lista delle prenotazioni dopo l'aggiornamento
          this.getReservations();
          // Resettare selectedReservation dopo l'aggiornamento
          this.clearForm();
        });
    }
  }

  clearForm(): void {
    // Resettare selectedReservation per consentire nuovi inserimenti/modifiche
    this.selectedReservation = { idPrenotazione: 0, idVolo: '', idCliente: 0, dataPrenotazione: new Date(), dataViaggio: new Date(), costoFatturato: 0, nomeGiorno: '' };
    this.showForm = false;
  }
}