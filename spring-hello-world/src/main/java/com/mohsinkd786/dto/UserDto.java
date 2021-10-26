package com.mohsinkd786.dto;

import java.util.UUID;

//@Data  //using lambok
public class UserDto
{
    private String id = UUID.randomUUID().toString();
    private String name;
    private float salary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
