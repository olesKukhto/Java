package com.company;

public class HourlyWages implements Wages{
    private int hoursInADay;
    private int paymentInAHours;
    private int workedDay;

    public HourlyWages(int hoursInADay, int paymentInADay, int workedDay) {
        this.hoursInADay = hoursInADay;
        this.paymentInAHours = paymentInADay;
        this.workedDay = workedDay;
    }

    @Override
    public void wages() {
        System.out.println(hoursInADay*paymentInAHours*workedDay);
    }
}
