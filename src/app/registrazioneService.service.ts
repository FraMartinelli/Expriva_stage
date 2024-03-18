import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Registrazione } from './models/registrazione';

@Injectable({
  providedIn: 'root'
})
export class RegistrazioneService {

  private apiUrl = 'http://localhost:8082';

  constructor(private http: HttpClient) {}

  // Aggiunto il parametro `registrazioneData` per inviare i dati del modulo
  addRegistrazione(registrazioneData: any): Observable<Registrazione[]> {
    return this.http.post<Registrazione[]>(`${this.apiUrl}/register`, registrazioneData);
  }

 
}