package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
          for (int i = 0;i<5;i++){
              number.setFloatNumber(scanner.nextFloat());
              number.floatNumberAsker();
        }}
    }

