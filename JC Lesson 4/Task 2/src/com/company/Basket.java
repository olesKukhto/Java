package com.company;

public class Basket {
    private  int length;
    private  int width;
    private  int heigth;
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int heigth){
        this.heigth = heigth;
    }
    int lenghtChanger(){
        length = length * 3;
        return length;
    }
    int widhtChanger(){
        width = width *2;
        return width;
    }
    int heightChanger(){
        heigth = heigth * 12;
        return heigth;
    }
    int getLenght(){
        this.length = lenghtChanger();
        return this.length;
    }
    int getWidth(){
        this.width = widhtChanger();
        return this.width;
    }
    int getHeight(){
        this.heigth = heightChanger();
        return this.heigth;
    }
}
