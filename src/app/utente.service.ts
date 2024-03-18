import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Utente } from './models/utente';

@Injectable({
  providedIn: 'root'
})
export class UtenteService {
  private apiUrl = 'http://localhost:8082';

  constructor(private http: HttpClient) {}

getUtente(): Observable<Utente[]> {
    return this.http.get<Utente[]>(`${this.apiUrl}/utenti`);
}

addUtente(reservation: Utente): Observable<any> {
  return this.http.post<any>(`${this.apiUrl}/utente/insert`, reservation);
}

updateUtente(reservation: Utente): Observable<any> {
  return this.http.put<any>(`${this.apiUrl}/utente/update/${reservation.idCliente}`, reservation);
}

deleteUtente(id: number): Observable<any> {
  return this.http.delete<any>(`${this.apiUrl}/utente/delate/${id}`);
}
}