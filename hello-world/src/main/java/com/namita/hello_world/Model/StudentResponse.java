package com.namita.hello_world.Model;

public class StudentResponse {

    private int id;
    private String name;
    private String department;

    public StudentResponse(){}// default constructor

    public StudentResponse(int id, String name, String department){

        this.id= id ;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }
    public  String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
}
