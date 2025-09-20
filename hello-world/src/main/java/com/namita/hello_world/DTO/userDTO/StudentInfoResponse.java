package com.namita.hello_world.Model;

public class StudentInfoResponse {

    private int id;
    private String name;
    private String department;

    public StudentInfoResponse(){}

    public StudentInfoResponse(int id, String name, String department){

        this.id = id;
        this.name = name;
        this.department = department;
    }
    public int getId() {

        return id;
    }
    public String getName(){

        return  name;
    }
    public String getDepartment(){

        return  department;
    }
}

