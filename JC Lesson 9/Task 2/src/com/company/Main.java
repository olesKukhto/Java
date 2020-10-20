package com.company;

import java.util.Scanner;

//Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи,
// які б розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
//        Якщо a<0, b<0 викидаємо IllegalArgumentException
//        Якщо a=0 b!=0 викидаємо ArithmeticException
//        Якщо a!=0 b=0 викидаємо ArithmeticException
//        Якщо a=0 b=0 викидаємо IllegalAccessException
//        Якщо a>0 b>0 викидаємо MyException
//        Протестувати всі можливі варіанти, і вивести все на консоль
public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        try{
            b = scanner.nextInt();
            a = scanner.nextInt();
               if(a < 0 && b < 0){ throw new IllegalArgumentException();}
               if(a == 0 && b != 0){throw new ArithmeticException();}
               if(a != 0 && b == 0){throw new ArithmeticException();}
               if (a == 0 && b == 0){throw new IllegalAccessException();}
               if(a > 0 && b > 0){throw new MyExeption("a > 0 && b > 0");}


        }catch (IllegalAccessException e){
            System.out.println("a == 0 && b == 0 ");
        } catch (MyExeption myExeption) {
            myExeption.printStackTrace();
        }
        catch (IllegalArgumentException e){
            System.out.println("a < 0 і b < 0");
        }
        catch (ArithmeticException e ){
            System.out.println("a == 0 && b != 0 або a != 0 && b == 0");
        }
    }
}
