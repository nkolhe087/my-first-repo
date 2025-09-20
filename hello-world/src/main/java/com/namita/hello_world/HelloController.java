package com.namita.hello_world;

import com.namita.hello_world.Model.JsonResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class HelloController {

    @GetMapping("/helloWorld")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/Welcome")
    public String sayWelcome(){
        return "Hey Welcome to the Java development World";

    }
// Response In JSON Format
  @GetMapping(value = "jsonResponse", produces = MediaType.APPLICATION_JSON_VALUE)
    public JsonResponse sayResponse(){

        return new JsonResponse("Hello Namita","Spring Boot");
  }
  //Path Variable
  @GetMapping("/hello/{name}")
    public JsonResponse sayHello(@PathVariable String name){
        return new JsonResponse("Hello " + name, "Spring Boot");
  }
 //Request Param
    @GetMapping("/hello")
    public  JsonResponse saysHello(@RequestParam String name){
        return new JsonResponse("Hello" +" " + name, "Spring Boot");
    }
}
