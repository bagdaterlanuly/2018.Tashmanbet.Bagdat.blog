package kz.greetgo.blog.register.impl;


import java.util.HashMap;
import java.util.Map;

public class TestClassForTest {
    public static Map<String,String> dbLogin = new HashMap<>();
    static {
        dbLogin.put("bagdat","111");
    }
    public String getPassword(String login){
        return dbLogin.get(login);
    }
}
