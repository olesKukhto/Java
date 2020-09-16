package com.company;

import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someString;
        someString = scanner.nextLine();
        someString = someString.toUpperCase();
        try {
            Months.valueOf(someString);
        } catch (IllegalArgumentException e) {
            System.out.println("Немає такого місяця");
            System.exit(0);
        }
        System.out.println();
        for (Months day : Months.values()) {
            if (day == Months.valueOf(someString)) {
                System.out.println("Є ");
                for (Months month : Months.values()) {
                    if (Months.valueOf(someString).getSeasons() == month.getSeasons()) {
                        System.out.println(month.name() + " Одинакова пора року ");
                    }
                }
                System.out.println();
                for (Months month : Months.values()) {
                    if (Months.valueOf(someString).getDay() == month.getDay()) {
                        System.out.println(month.name() + " Одинакова кількість днів ");
                    }
                }
            }


        }
        System.out.println();
        for (Months months : Months.values()) {
            if (Months.valueOf(someString).getDay() > months.getDay()) {
                System.out.println("В місяці -> " + someString + " більше днів ніж в " + months.name());
            }
        }
        System.out.println();
        for (Months months : Months.values()) {
            if (Months.valueOf(someString).getDay() < months.getDay()) {
                System.out.println("В місяці -> " + someString + " менше днів ніж в " + months.name());

            }

        }
        System.out.println();
        switch (Months.valueOf(someString).getSeasons()){
            case AUTUMN:
                System.out.println("Winter is coming");
                break;
            case SPRING:
                System.out.println("Наступна пора року Літо ");
                break;
            case SUMMER:
                System.out.println("Наступна пора року Осінь");
                break;
            case WINTER:
                System.out.println("Наступна пора року Весна");
        }
        switch (Months.valueOf(someString).getSeasons()){
            case AUTUMN:
                System.out.println("Попередня пора року Літо");
                break;
            case SPRING:
                System.out.println("Попередня пора року Зима ");
                break;
            case SUMMER:
                System.out.println("Попередня пора року Весна ");
                break;
            case WINTER:
                System.out.println("Попередня пора року Осінь");
                break;

    }
        System.out.println();
        for (Months months: Months.values()) {
            if(months.getDay() % 2 == 1){
                System.out.println("В місяці "+months+" не парна кількість днів");
            }
        }
        System.out.println();
        for (Months m: Months.values()) {
            if(m.getDay()%2 == 0 ){
                System.out.println("В місяці "+m+" парна кількість днів");
            }
        }
             }
}

