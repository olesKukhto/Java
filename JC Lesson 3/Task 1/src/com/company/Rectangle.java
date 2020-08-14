package com.company;
import java.util.Scanner;
public class Rectangle {
    private int width;
    private int lenght;
    Scanner scanner = new Scanner(System.in);
    public  Rectangle(){

    }
    public Rectangle(int l,int w){
        l = lenght;
        w = width;
    }
    public int setWidth(){
        System.out.println("Введіть ширину =");
         this.width = scanner.nextInt();
         return width;
    }
    public int setLeght(){
        System.out.println("Введіть довжину = ");
        this.lenght = scanner.nextInt();
        return lenght;
    }
    public void perimeterAndArea(){
        int area = this.lenght*this.width;
        int perimeter = 2*(this.width + this.lenght);
        System.out.println("Це периметр = "+perimeter);
        System.out.println("Це площа = "+area);
    }


}