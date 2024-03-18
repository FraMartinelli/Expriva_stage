import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UtenteComponent } from './utente/utente.component';
import { InsertComponent } from './insert/insert.component';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatInputModule } from '@angular/material/input';
import { MatNativeDateModule } from '@angular/material/core';
import { prenotazioni } from './prenotazioni/prenotazioni.component';
import { RegistrazioneComponent } from './registrazione/registrazione.component';
import {MatDialogModule} from '@angular/material/dialog'
import { MatButtonModule } from '@angular/material/button';
import { HeaderComponent } from './header/header.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { RegistrazioneService } from './registrazioneService.service';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatIconModule} from '@angular/material/icon';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatGridListModule} from '@angular/material/grid-list';
import { MatSidenav } from '@angular/material/sidenav';
import { MatSidenavContainer } from '@angular/material/sidenav';
import { MatSidenavContent } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatSelectModule } from '@angular/material/select';
import {MatMenuModule} from '@angular/material/menu';
import {MatTableModule} from '@angular/material/table';
import { ClientiComponent } from './clienti/clienti.component';




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    UtenteComponent,
    InsertComponent,
    prenotazioni,
    RegistrazioneComponent,
    HeaderComponent,
    ClientiComponent,
    
   
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    MatDatepickerModule,
    MatInputModule,
    MatNativeDateModule,
    MatDialogModule,
    MatButtonModule,
    MatFormFieldModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatToolbarModule,
    MatGridListModule,
    MatSidenav,
    MatSidenavContainer,
    MatSidenavContent,
    MatListModule,
    MatSelectModule,
    MatMenuModule,
    MatTableModule
    

  ],
  providers: [
    RegistrazioneService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
