package kz.greetgo.blog.controller.Register;


public class Response{
    public static final int codesucc=0;
    public static final int codefail=1;

    public static final String notres="not registed";
    public static final String invpass="Incorrect password";
    public static final String succmess="You are logged in,%s";

    private int responseCode;
    private String responseMessage;

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}