package com.reubenhawley;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }
    public String toString(){
        return "Java is like C#";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
