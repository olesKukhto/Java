package com.company;

public class Helm extends Car {
    private int helmDiameter;
    private int helmRadius;
    private int helmLength;
    public Helm (int d,int r,int l){
        this.helmDiameter = d;
        this.helmLength = l;
        this.helmRadius = r;
    }void setHelmDiameter (int diameter){
        this.helmDiameter = diameter;
    }
    void setHelmRadius (int radius){
        this.helmRadius = radius;
    }
    void setHelmLength (int length){
        this.helmLength = length;
    }
    int getHelmDiameter(){
        return this.helmDiameter;
    }
    int getHelmRadius(){
        return this.helmRadius;
    }
    int getHelmLenght(){
        return this.helmLength;
    }

    void allHelmSetsChanger(){
        this.helmRadius = helmRadius *2;
        this.helmLength = helmLength *3;
        this.helmDiameter = helmDiameter*4;
    }
}