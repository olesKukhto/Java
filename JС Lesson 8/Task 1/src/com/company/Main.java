package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Months.values());
        Scanner scanner = new Scanner(System.in);
        String someString = new String();
        someString = scanner.nextLine();
        someString = someString.toUpperCase();
        System.out.println(Months.APRIL);
        System.out.println(Months.valueOf("APRL"));




//        switch (someString) {
//            case "january":
//
//                break;
//            case "february":
//
//                break;
//            case "march":
//
//                break;
//            case "april":
//
//                break;
//            case "may":
//
//                break;
//            case "june":
//
//                break;
//            case "july":
//
//                break;
//            case "august":
//
//                break;
//            case "september":
//                ;
//            case "october":
//
//                break;
//            case "november":
//                ;
//            case "december":
//
//                break;
//            default:
//
//                break;        }
//    }
}
}
