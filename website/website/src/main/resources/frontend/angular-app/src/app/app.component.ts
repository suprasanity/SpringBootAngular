import { Component } from '@angular/core';
import {User} from "./user";
import * as CryptoJS from 'crypto-js';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nom: any;
  prenom : any;
  email:any;
  date :any;
  mdp : any;

  addUser() {
    let hashMdp = CryptoJS.enc.Utf8.parse(this.mdp).toString();
    let user =new User(this.nom,this.prenom,this.email,new Date(this.date),hashMdp);

  }
}
