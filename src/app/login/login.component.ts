
import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = "";
  password: string= "";

  constructor(private router: Router) { }

  login(username: string, password: string) {
    if (username === 'utente' && password === 'password') {
      this.router.navigate(['home']);
      return true; // Indica che il login è riuscito
    } else {
      alert('Credenziali non valide. Riprova.');
      return false; // Indica che il login non è riuscito
    }
  }
}
