import { Component, OnInit } from '@angular/core';
import {BackService} from "../back.service";
import * as http from "http";
import {HttpClient, HttpHandler} from "@angular/common/http";


@Component({
  selector: 'app-saisi-bot',
  templateUrl: './saisi-bot.component.html',
  styleUrls: ['./saisi-bot.component.css']
})
export class SaisiBotComponent implements OnInit {
text : String | undefined;

  constructor(private b : BackService) {
  }

  ngOnInit(): void {
  }
  sendMessage():void{
    if (this.text != null) {

      this.b.sendMsg(this.text)
    }
  }

}
