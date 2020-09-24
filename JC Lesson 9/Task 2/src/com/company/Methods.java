package com.company;

public class Methods {
    private int x = 0 ;
    private int y;
    private int sum;
    public Methods(int y,int x){
        this.x = x;
        this.y = y;

    }
    public int methodPlus(){
        sum =this.x + this.y;
        return sum;
   }
   public int methodMinus(){
        sum = this.x + this.y;
        return sum;
   }
    public int methodMultiply(){
        sum =this.x * this.y;
        return sum;
   }
   public int methodDevide(){
        sum =this.x / this.y;
        return sum;
    }
 }

