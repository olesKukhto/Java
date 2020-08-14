package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int max = 0;
        int min = 0;
        for (int x = 0;x < 10;x++)
        {
            array[x] = scanner.nextInt();
        }
        min = array[1];
           for(int i = 0;i < 10;i++)
           {
               if (array[i] > max ) {
                   max = array[i];
               }
               if (array[i] < min){
                   min = array[i];
               }
           }
        System.out.println("Найменше число "+ min);
        System.out.println("Найбільше число "+ max);
    }
}
