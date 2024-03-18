import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrazioneService } from '../registrazioneService.service';

@Component({
  selector: 'app-registrazione',
  templateUrl: './registrazione.component.html',
  styleUrls: ['./registrazione.component.css'],
})
export class RegistrazioneComponent {
  nome: string = '';
  email: string = '';
  password: string = '';
  eta!: number;
  numeroTelefono!: number;
  erroreRegistrazione: string = '';
  indirizzo: string = '';

  constructor(private router: Router, private registrazioneService: RegistrazioneService) {}

  registra() {
    // Check if all fields are filled
    if (!this.nome || !this.email || !this.password || !this.eta || !this.numeroTelefono || !this.indirizzo) {
      this.erroreRegistrazione = 'Compila tutti i campi.';
      return;
    }
  
    // Prepare registration data
    const registrazioneData = {
      nome: this.nome,
      email: this.email,
      password: this.password,
      eta: this.eta,
      numeroTelefono: this.numeroTelefono,
      indirizzo: this.indirizzo
      
    };
  
    // Call the registration service with data
    this.registrazioneService.addRegistrazione(registrazioneData).subscribe(
      (result: any) => {
        console.log('Registrazione avvenuta con successo.', result);
        // You can add redirection to a login page or perform other actions here
        this.router.navigate(['/home']);
      }, 
      (error: any) => {
        console.error('Errore durante la registrazione.', error);
        this.erroreRegistrazione = 'Errore durante la registrazione. Riprova.';
      }
    );
  }
}