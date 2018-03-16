package kz.greetgo.blog.stand.registr_impl;

import kz.greetgo.blog.controller.Register.TestRegister;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.blog.controller.Register.Response;
import kz.greetgo.blog.controller.Register.User;

@Bean
public class TestRegisterIMpl implements TestRegister {

    private User[] registeredUsers=new User[]{
            new User("bagdat","1234"),
            new User("bill","456"),
            new User("kairat","qweqwe"),
            new User("mark","1234"),
            new User("bob","qaz"),
            new User("alice","wwww")

    };

    @Override
    public Response login(String username, String password) {
        Response response=new Response();
        response.setResponseCode(Response.RESPONSE_CODE_FAIL);
        response.setResponseMessage(Response.RESPONSE_MESSAGE_NOT_REGISTERED_YET);
        for (User userI:registeredUsers){
            if (username.equals(userI.getUsername())){
                if (password.equals(userI.getPassword())){
                    response.setResponseCode(Response.RESPONSE_CODE_SUCCESS);
                    response.setResponseMessage(String.format(Response.RESPONSE_MESSAGE_SUCCESS,username));
                }else {
                    response.setResponseCode(Response.RESPONSE_CODE_FAIL);
                    response.setResponseMessage(Response.RESPONSE_MESSAGE_INVALID_PASSWORD);
                }
                break;
            }
        }
        return response;
    }
}
