package com.company;

public class Wheel {
    private int wheelDiameter;
    private int wheelRadius;
    public Wheel(int d,int r) {
        this.wheelDiameter = d;
        this.wheelRadius = r;
   }
   void setWheelRadius(int radius){
        this.wheelRadius = radius;
    }
    void setWheelDiameter(int diameter){
        this.wheelDiameter = diameter;
    }
   int getDiameter(){
        return this.wheelDiameter;
   }
   int getWheelRadius(){
        return this.wheelRadius;
   }

}
