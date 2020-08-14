package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan1 = scanner.nextInt();
        int scan2 = scanner.nextInt();
        boolean i = true;
        int x =0;
        int y =0;
        while(i)
        {
            if (scan1 > scan2){
                scan1 = scan1 - scan2;
            }
            else if(scan2 > scan1)
                {
                scan2 = scan2 - scan1;
                }
            else if (scan1 == scan2){
                System.out.println("НСК = "+scan1);
                break;
        }
    }
}
}
