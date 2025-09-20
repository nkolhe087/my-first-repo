package com.namita.hello_world.Model;


public class JsonResponse {

    private String message;
    private String author;
    private int id;
    private String email;

    //Constructor
    public JsonResponse(String message, String author) {

        this.message = message;
        this.author = author;
        this.id = 101;
        this.email = "namita@example.com";
    }
     //getter
    public String getMessage()
    {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public int getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
}
