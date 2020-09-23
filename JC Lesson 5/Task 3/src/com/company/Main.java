package com.company;
import 
import Darwin
public class Main {

    public static void main(String[] args) {
        boolean tru = true;
        double someNubmer = 100;
        for(int i = 0;i < 10;i++){
            someNubmer++;
            someNubmer=someNubmer+0.00000000000001;
            if (someNubmer < 0 ){
                System.out.println(someNubmer);
                break;
            }
        }
    }
}
