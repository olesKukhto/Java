package com.company;

public class Main {

    public static void main(String[] args) {
        Wages person1 = new HourlyWages(12,65,20);
        Wages person2 = new MonthWages(500);
        person1.wages();
        person2.wages();
    }
}
