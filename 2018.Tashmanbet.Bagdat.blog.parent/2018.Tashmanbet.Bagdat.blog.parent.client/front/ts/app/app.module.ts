import {NgModule} from "@angular/core"
import {AppComponent} from "./app.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpService} from "../provider/HttpService";
import {HttpModule} from "@angular/http";
<<<<<<< HEAD
import {FormsModule} from "@angular/forms";
@NgModule({
    imports:[
        BrowserModule,HttpModule,  FormsModule

=======
@NgModule({
    imports:[
        BrowserModule,HttpModule
>>>>>>> f43271ae15ad2ebae7df3477ee5d78cb0c4cd822
    ],
    declarations:[AppComponent],
    providers:[HttpService],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent]

})

export class AppModule{

}
