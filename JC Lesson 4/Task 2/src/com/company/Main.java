package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
               Car car = new Car();
               Wheel wheel = new Wheel(0,0);
               Basket basket = new Basket(0,0,0);
               Helm helm = new Helm(0,0,0);
        basket.setBasketWidth(scan.nextInt());
        basket.setBasketLength(scan.nextInt());
        basket.setBasketHeigth(scan.nextInt());
        wheel.setWheelRadius(scan.nextInt());
        wheel.setWheelDiameter(scan.nextInt());
        helm.setHelmDiameter(scan.nextInt());
        helm.setHelmLength(scan.nextInt());
        helm.setHelmRadius(scan.nextInt());
        helm.allHelmSetsChanger();
        basket.allBasketSetsChanger();
        System.out.println(helm.getHelmDiameter() + " "+ "Діаметер керма");
        System.out.println(helm.getHelmLenght()+" "+ "Дожина керма");
        System.out.println(helm.getHelmRadius()+" "+"Радіус керма");
        System.out.println(wheel.getDiameter()+" "+"Діаметр колеса");
        System.out.println(wheel.getWheelRadius()+" "+"Радіус колеса");
        System.out.println(basket.getBasketHeigth()+" " +"Висота кузова");
        System.out.println(basket.getBasketLength()+" "+"Дожина кузова");
        System.out.println(basket.getBasketWidth()+" "+"Ширина кузова");


    }
}
