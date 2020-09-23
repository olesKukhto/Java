package com.lgs.lab.interface2;
import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    private double x;
    private double y;
    private double suma;
    private double difference;
    private double denominator;
    private double product;

    public MyCalculator(double x , double y ) {
        this.x = x;
        this.y = y;
    }


    @Override
    public double plus() {
        this.suma = x + y;
        return suma;
    }

    @Override
    public double minus() {
        difference = x - y;
        return difference;
    }

    @Override
    public double multiply() {
        this.product = x*y;
        return product;
    }

    @Override
    public double devide() {
        this.denominator = x /y;
        return denominator;
    }}
