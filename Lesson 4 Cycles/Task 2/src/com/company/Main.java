package com.company;
public class Main
{
    public static void main(String[] args) {
        int x=95;
        boolean n = true;
        while(n){
            x=x-5;
            if(x<0) {
                break;
            }
            System.out.println(x);
        }

    }
}