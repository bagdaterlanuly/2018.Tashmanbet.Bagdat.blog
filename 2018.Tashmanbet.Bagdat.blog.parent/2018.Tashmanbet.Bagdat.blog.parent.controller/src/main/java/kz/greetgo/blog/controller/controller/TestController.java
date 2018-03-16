package kz.greetgo.blog.controller.controller;

import kz.greetgo.blog.controller.Register.Response;
import kz.greetgo.blog.controller.Register.TestRegister;
import kz.greetgo.blog.controller.utils.Controller;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.AsIs;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
public class TestController implements Controller{

    public BeanGetter<TestRegister> testRegisterBeans;

    public static class User{
        String username;
        String password;
    }

    @ToJson
    @AsIs
    @Mapping("/getMainText")
    public Response getText(@Par("username") String username, @Par("password") String password){
        return testRegisterBeans.get().login(username,password);
    }

}