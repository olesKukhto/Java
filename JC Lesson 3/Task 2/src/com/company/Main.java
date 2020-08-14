package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус - ");
        double radius = scanner.nextDouble();
        System.out.println("Введіть діаметр - ");
        double diameter = scanner.nextDouble();
        Circle circle = new Circle(radius,diameter);
        System.out.println(circle.itsArea());
        System.out.println(circle.itsLenght());
    }
}
