package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal("", 0, 0);
        animal.setName(scanner.nextLine());
        animal.setSpeed(scanner.nextInt());
        animal.setAge(scanner.nextInt());
        System.out.println("Назва тварини - " + animal.getName() + ",Швидкість = " + animal.getSpeed() + "км/год,Вік тварини - " + animal.getAge() + " років");
    }
}



