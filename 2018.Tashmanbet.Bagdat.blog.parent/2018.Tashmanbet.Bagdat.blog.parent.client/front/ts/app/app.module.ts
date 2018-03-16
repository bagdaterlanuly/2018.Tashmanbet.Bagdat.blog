import {NgModule} from "@angular/core"
import {AppComponent} from "./app.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpService} from "../provider/HttpService";
import {HttpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";
@NgModule({
    imports:[
        BrowserModule,HttpModule,  FormsModule

    ],
    declarations:[AppComponent],
    providers:[HttpService],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent]

})

export class AppModule{

}