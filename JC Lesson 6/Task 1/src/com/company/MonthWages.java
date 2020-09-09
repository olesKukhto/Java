package com.company;

public class MonthWages implements Wages {
        private int paymentInADay;

    public MonthWages(int paymentInADay) {
        this.paymentInADay = paymentInADay;
    }

    @Override
    public void wages() {
        System.out.println(paymentInADay * 20);
    }
}
