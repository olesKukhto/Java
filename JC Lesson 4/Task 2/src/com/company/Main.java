package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
             Basket basket = new Basket();
             Scanner scan = new Scanner(System.in);
        System.out.println("Введіть висоту кузова");
                basket.setHeight(scan.nextInt());
        System.out.println("Введіть довжину кузова");
                basket.setLength(scan.nextInt());
        System.out.println("Введіть ширину кузова");
                basket.setWidth(scan.nextInt());
    }
}
