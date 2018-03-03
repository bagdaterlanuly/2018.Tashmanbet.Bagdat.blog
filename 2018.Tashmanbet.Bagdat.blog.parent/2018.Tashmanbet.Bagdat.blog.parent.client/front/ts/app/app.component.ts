import {Component, OnInit} from "@angular/core";
import {HttpService} from "../provider/HttpService";
import "rxjs/add/operator/toPromise";


@Component({
    selector:"blog_app",
    template:`<div class="login-page">
        <div class="form">
            <form class="register-form">
                <input type="text" placeholder="name"/>
                <input type="password" placeholder="password"/>
                <input type="text" placeholder="email address"/>
                <button>create</button>
                <p class="message">Already registered? <a href="#">Sign In</a></p>
            </form>
            <form class="login-form">
                <input type="text" placeholder="username"/>
                <input type="password" placeholder="password"/>
                <button>login</button>
                <p class="message">Not registered? <a href="#">Create an account</a></p>
            </form>
        </div>
    </div>
    `
})
export class AppComponent implements OnInit {
    private text:string;

    ngOnInit(): void {
        this.httpService.get("/getMainText").toPromise().then(
            result =>{

                this.text=result.json().text;
            },
            error =>{
                this.text="Something is wrong";

            }
        )
    }
    constructor (private httpService:HttpService){
    }
}