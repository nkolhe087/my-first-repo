package com.namita.hello_world;

import com.namita.hello_world.Model.StudentInfoResponse;
import com.namita.hello_world.Model.StudentRequest;
import com.namita.hello_world.Model.StudentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/student")
    public StudentResponse studentData(@RequestBody StudentResponse student){
        return student;
    }

    @PostMapping("/studentData")
    public StudentInfoResponse stdData(@RequestBody StudentRequest request){
        return new StudentInfoResponse(10, request.getName(),request.getDepartment());
    }
}
