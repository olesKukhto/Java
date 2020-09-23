package com.company;


import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int sum = x + y;
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Число було введене не правильно");
        }
    }
}