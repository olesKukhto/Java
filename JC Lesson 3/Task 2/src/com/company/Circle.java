package com.company;
import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);
    public double radius;
    public double diameter;
    double pi = 3.14;
    public Circle(double r, double d){
        this.radius = r;
        this.diameter = d;
    }
    double itsArea(){
        System.out.println("Площа круга = ");
        double area = (pi / 4 )*(Math.pow(this.diameter , 2));
        return area;
    }
    double itsLenght(){
        System.out.println("Довжина кола  = ");
        double lenght = 2* pi *this.radius;
        return lenght;

    }
}