package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть змінну m");
        int number1 = scanner.nextInt();
        System.out.println("Введіть змінну n ");
        int number2 = scanner.nextInt();
        boolean i=true;
        int m=0;
        int n =0;
        if(number1 > 10)
        {
            while(i){
                m++;
                number1--;
                if(number1 == 10){
                    break;
                }
            }
        }
        else {
            while(i){
                m++;
                number1++;
                if (number1 == 10)
                {
                    break;
                }
            }
        }
        if(number2 >10){
            while(i){
                n++;
                number2--;
                if(number2 == 10){
                    break;
                }
            }
        }else {
            while(i){
                n++;
                number2++;
                if(number2==10){
                    break;
                }
            }
        }
        if(m < n){
            System.out.println("число m блище до 10");
        }
        else if(m==n){
            System.out.println("Числа одинаково близько до 10");
        }
        else {
            System.out.println("число n блищн до 10");
        }
    }
}