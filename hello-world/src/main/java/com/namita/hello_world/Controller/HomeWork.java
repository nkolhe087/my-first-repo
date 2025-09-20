package com.namita.hello_world;

import com.namita.hello_world.Model.Book;
import com.namita.hello_world.Model.GreetingResponse;
import com.namita.hello_world.Model.JsonResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeWork {

    @GetMapping("/Welcomes")
    public String Streets() {
        return "Welcome to India" ;
    }

@GetMapping("/name/{name}")
    public GreetingResponse name(@PathVariable String name){
        return new GreetingResponse("Good Morning",name, "Namita");
}




    /*@GetMapping("/user/{id}")
    public JsonResponse UserId(@PathVariable String name) {
        return new JsonResponse("101" + name, "Spring Boot");
    }*/
}