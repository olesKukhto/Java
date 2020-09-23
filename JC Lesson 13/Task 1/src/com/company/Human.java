package com.company;

public class Human {
    private int weight;
    private int height;
    public Human (int weight,int height){
        this.height = height;
        this.weight = weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getHeight(){
        return this.height;
    }
}
