package com.example.kubedemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aalexandrakis on 11/06/2017.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public Response testController(){
        System.out.println("Calling test controller");
        return new Response("This is a message", "This is another message");
    }
}

class Response {
    private String message;
    private String anotherMessage;

    public Response(String message, String anotherMessage) {
        this.message = message;
        this.anotherMessage = anotherMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAnotherMessage() {
        return anotherMessage;
    }

    public void setAnotherMessage(String anotherMessage) {
        this.anotherMessage = anotherMessage;
    }
}