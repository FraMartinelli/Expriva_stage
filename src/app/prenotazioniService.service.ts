import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Prenotazioni } from './models/prenotazioni';
@Injectable({
  providedIn: 'root'
})
export class prenotazioniService {
  private apiUrl = 'http://localhost:8082';

  constructor(private http: HttpClient) {}

getReservations(): Observable<Prenotazioni[]> {
    return this.http.get<Prenotazioni[]>(`${this.apiUrl}/prenotazioni`);
}

addReservation(reservation: Prenotazioni): Observable<any> {
  return this.http.post<any>(`${this.apiUrl}/prenotazione/insert`, reservation);
}

updateReservation(reservation: Prenotazioni): Observable<any> {
  return this.http.put<any>(`${this.apiUrl}/prenotazione/update/${reservation.idPrenotazione}`, reservation);
}

deleteReservation(id: number): Observable<any> {
  return this.http.delete<any>(`${this.apiUrl}/prenotazione/delete/${id}`);
}
}