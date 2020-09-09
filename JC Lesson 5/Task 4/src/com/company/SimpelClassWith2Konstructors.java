package com.company;

public class SimpelClassWith2Konstructors {
    public int x;
    public int y;
    public int r;
    public SimpelClassWith2Konstructors(int x,int y){
        this.x = x;
        this.y = y;
    }
    public SimpelClassWith2Konstructors(int x,int y,int r){
        this(x,y);
        this.r = r;
    }
}
