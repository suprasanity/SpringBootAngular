import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable(
  {providedIn: 'root'}
)
export  class BackService {

  constructor(private http: HttpClient) { }


  public sendMsg(pmsg: String): void {
    let headers = new HttpHeaders();
    headers.append('Access-Control-Allow-Origin','*')
    headers.append('Content-Type','application/json');

    this.http.post<any>("http://chovy.freeboxos.fr:8080/botMsg", pmsg,{ headers: headers}).subscribe()
  }
}
