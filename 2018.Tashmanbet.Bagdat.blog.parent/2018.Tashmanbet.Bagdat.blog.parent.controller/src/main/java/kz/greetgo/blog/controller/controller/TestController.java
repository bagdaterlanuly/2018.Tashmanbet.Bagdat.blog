package kz.greetgo.blog.controller.controller;

import kz.greetgo.blog.controller.utils.Controller;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
public class TestController implements Controller{

    @ToJson
    @Mapping("/getMainText")
    public String getText() {
        System.out.println("fdsfsdfsdfdsfds");
        return "Everything is ok";
    }
}
