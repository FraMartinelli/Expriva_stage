import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RegistrazioneComponent } from './registrazione/registrazione.component';
import { prenotazioni } from './prenotazioni/prenotazioni.component';


const routes: Routes = [
  
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'registrazione', component: RegistrazioneComponent },
  { path: 'prenotazioni', component: prenotazioni },
  {path: 'home', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

