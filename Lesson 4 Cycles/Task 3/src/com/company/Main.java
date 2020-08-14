package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float scan = scanner.nextFloat();
        boolean i = true;
        while (i) {
            scan = scan % 2;

        if (scan == 0) {
            System.out.println("Число парне");
            break;
        } else if (scan > 1 || scan == 1) {
            System.out.println("Число не парне");
            break;
        }

    }
    }
}
