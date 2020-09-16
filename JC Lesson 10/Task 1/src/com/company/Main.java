package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someString;
        someString = scanner.nextLine();
        String[] stringArray;
        stringArray = someString.split("",5);
        try {
            if ((stringArray[0].equals(stringArray[4])) && (stringArray[1].equals(stringArray[3]))) {
                System.out.println("Слово " + someString + " Поліндром");
                stringArray[1] = "-";stringArray[3] = "-";
                System.out.println(stringArray[0] + stringArray[1]+stringArray[2]+stringArray[3]+stringArray[4]);

            }
             else {
                System.out.println("слово не поліндром");
            }
        } catch (Exception e) {
            System.out.println("Потрібно слово з 5 букв");
        }
    }
}

