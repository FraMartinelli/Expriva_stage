import {Component, ViewChild} from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { LoginComponent } from '../login/login.component';
import { RegistrazioneComponent } from '../registrazione/registrazione.component';
import { MatSidenav } from '@angular/material/sidenav';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  @ViewChild('sidenav') sidenav!: MatSidenav;


  toggleSidenav() {
      this.sidenav.toggle();
  }

  constructor(protected dialog:MatDialog){}
  loginDialog(){
    this.dialog.open(LoginComponent);
  }
  registerDialog(){
    this.dialog.open(RegistrazioneComponent, {width:"200 px"});
  }
}