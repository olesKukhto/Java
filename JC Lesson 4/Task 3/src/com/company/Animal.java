package com.company;

public class Animal {
    private String name;
    private int speed;
    private int age;
    public Animal(String name,int speed ,int age){
        this.name = name;
        this.age = age;
        this.speed = speed;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    String getName(){
        return name;
    }
    int getSpeed(){
        return speed;
    }
    int getAge(){
        return age;
    }
}
