package com.revature;

public class Student {
    int id;
    String Name;
    public Student(){}
    public Student(int id, String Name){
        this.id = id;
        this.Name = Name;
    }
    public void printDetails(){
        System.out.println("Student id : "+this.id+", Name : "+this.Name);
    }
}
