package com.namita.hello_world.Model;

public class StudentRequest {

    private String name;
    private String department;


    public StudentRequest(){}

    public StudentRequest(String firstName, String lastName, int rollNo){
        this.name = firstName;
        this.department = department;

    }
    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }


}
