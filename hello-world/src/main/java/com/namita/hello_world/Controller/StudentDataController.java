package com.namita.hello_world.Controller;

import com.namita.hello_world.Model.StudentInfoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentDataController {

    @GetMapping("/studentsData")
    public List<StudentInfoResponse> getStdData(){

        List<StudentInfoResponse> Sd = new ArrayList<>();

        Sd.add(new StudentInfoResponse(1, "Namita", "CS"));
        Sd.add(new StudentInfoResponse(2, "Neha", "Commerce"));
        Sd.add(new StudentInfoResponse(3, "Nilam", "Art"));

        return Sd;
    }

    @PostMapping("/studentsInfo")
     public StudentInfoResponse AddStdData(@RequestBody StudentInfoResponse student){
       return student;
   }

 }


