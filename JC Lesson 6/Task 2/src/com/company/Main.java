package com.company;

import com.lgs.lab.interface1.Numerable;
import com.lgs.lab.interface2.MyCalculator;

public class Main {

    public static void main(String[] args) {
        MyCalculator miniCalculator = new MyCalculator(5,5);
        System.out.println(miniCalculator.multiply());
        System.out.println(miniCalculator.minus());
        System.out.println(miniCalculator.plus());
        System.out.println(miniCalculator.devide());
    }
}
