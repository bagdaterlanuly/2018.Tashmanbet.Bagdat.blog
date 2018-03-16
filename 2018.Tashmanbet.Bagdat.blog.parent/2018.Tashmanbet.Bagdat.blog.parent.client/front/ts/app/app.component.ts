import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";


@Component({
    selector:"blog_app",
    template:`<h1>{{text}}</h1>
    <h1> {{responseMessage}}</h1>
    <div class="login-page">
        <div class="form">
          
            <form class="login-form" (submit)="onSubmitButtonClicked()">
                <input type="text" id="login" name="login" placeholder="login" [(ngModel)]="User.username" />
                <input type="text" id="password" name="password" placeholder="password" [(ngModel)]="User.password"/>
                
                <button type="submit">login</button>

                <p class="message">Not registered? <a href="#">Create an account</a></p>
            </form>
        </div>
    </div>
    `
})
export class AppComponent implements OnInit {
    private responseCode:string;
    private responseMessage:string;

    User: any={};
    parameters : { [key: string]: string} = {};

    ngOnInit(): void {

    }
    onSubmitButtonClicked():void{
        this.parameters["username"]=this.User.username;
        this.parameters["password"]=this.User.password;

        this.httpService.get("/getMainText",this.parameters).toPromise().then(
            result =>{
                this.responseCode=result.json().responseCode;
                this.responseMessage=result.json().responseMessage;
            },
            error =>{
                this.responseMessage="Something is wrong";

            }
        )
    }
    constructor (private httpService:HttpService){
    }
}