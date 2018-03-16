package kz.greetgo.blog.controller.Register;


public class Response{
    public static final int RESPONSE_CODE_SUCCESS=0;
    public static final int RESPONSE_CODE_FAIL=1;

    public static final String RESPONSE_MESSAGE_NOT_REGISTERED_YET="not registed";
    public static final String RESPONSE_MESSAGE_INVALID_PASSWORD="Incorrect password";
    public static final String RESPONSE_MESSAGE_SUCCESS="You are logged in,%s";

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