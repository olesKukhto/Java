package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Кількість кидків");
        Scanner scanner = new Scanner(System.in);
        int someNumber = scanner.nextInt();
        for( int i = 0; i < someNumber; i++){
           int randomNumber = random.nextInt(2)+1;
           if (randomNumber == 1){
               System.out.println("Випав Орел");
           }
           else {
               System.out.println("Випала Решка");
           }
        }
    }
}
