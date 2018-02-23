import {NgModule} from "@angular/core"
import {AppComponent} from "./app.component";
import {BrowserModule} from "@angular/platform-browser";
@NgModule({
    imports:[
        BrowserModule
    ],
    declarations:[AppComponent],
    providers:[],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent]
})

export class AppModule{

}