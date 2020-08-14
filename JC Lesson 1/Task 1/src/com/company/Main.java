package com.company;

public class Main {

    public static void main(String[] args) {
               char max =  '1';
               max = max + max;
               int x = 1;
               int number;
               boolean tru = true;
               while (tru){
                   number = x;
                   x = x + 1 ;
                   if (x < 0){
                       System.out.println("Максимум = "+number);
                       System.out.println("Мінімум = -"+number);
                       break;
                   }
               }

    }
}
