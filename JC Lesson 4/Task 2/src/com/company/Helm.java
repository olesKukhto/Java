package com.company;
import java.util.Scanner;
public class Helm {
    Scanner scanner = new Scanner(System.in);
    private int diameter;
    private int radius;
    private int length;
    public Helm(int l,int r,int d) {
        this.diameter = d;
        this.radius = r;
        this.length = l;
    }
    void setDiameter(){
        this.diameter =scanner.nextInt();
    }
    void setRadius(){
        this.radius = scanner.nextInt();
    }
    void setLength(){
        this.length = scanner.nextInt();
    }
    int getDiameter(){
        this.diameter = diameterChanger();
        return diameter;
    }
    int getRadius(){
        this.radius = radiusChanger();
        return radius;
    }
    int getLength(){
        this.length = lengthChanger();
        return length;
    }
    int diameterChanger(){
        this.diameter = diameter * 2;
        return diameter;
    }
    int radiusChanger(){
        this.radius = radius * 3;
        return radius;
    }
    int lengthChanger(){
        this.length = length * 4;
        return length;
    }
}
