package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,1);
        int width = rectangle.setLeght();
        int leght = rectangle.setWidth();
        rectangle.perimeterAndArea();
        Rectangle test = new Rectangle();
        leght = test.setWidth();
        width = test.setLeght();
        test.perimeterAndArea();
    }



}
