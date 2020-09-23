package com.company;

public class Number {
    float floatNumber;

    public void setFloatNumber(float floatNumber) {
        this.floatNumber = floatNumber;
    }

    public void Number(float floatNumber) {
           this.floatNumber = floatNumber;
   }
   void floatNumberAsker(){
           float someNumber = this.floatNumber % 2;
         if(someNumber > 1) {
             System.out.println("Ви ввели не ціле число");
         }
         if (someNumber == 0){
             System.out.println("Число є парним");
         }
         if (someNumber == 1){
             System.out.println("Число не парне");
         }
         }
   }

