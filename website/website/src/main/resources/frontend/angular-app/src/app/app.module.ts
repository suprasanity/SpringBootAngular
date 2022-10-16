import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import { SaisiBotComponent } from './saisi-bot/saisi-bot.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    SaisiBotComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
         HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class test {

}
