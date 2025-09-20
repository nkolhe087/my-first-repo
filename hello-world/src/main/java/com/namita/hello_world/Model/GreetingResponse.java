package com.namita.hello_world.Model;

public class GreetingResponse {

    private String greeting;
    private String to;

    public GreetingResponse(String greeting, String to, String number) {
        this.greeting = greeting;
        this.to = to;

    }

public String getGreeting() {

        return greeting;
}
public String getTo(){
        return to;
}
}
