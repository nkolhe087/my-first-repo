package com.namita.hello_world;

import com.namita.hello_world.Model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

    @GetMapping("/book")
    public Book bookByName(@RequestParam(name = "name") String name){
        return new Book(10, "Spring Boot Basics", "Namita");
    }
    @GetMapping("/book2")
    public Book bookByName2(@RequestParam(name = "name", required = false, defaultValue = "Unknown")String name){
        return new Book(11, "SpringBott Basics", "Namita");
    }
    @GetMapping("/book/{id}")
    public Book bookById(@PathVariable int id){
        return new Book(id, "Spring Boot Basics","Namita");
    }
}
