package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи день");
		String day = scanner.nextLine();
		switch (day) {
		case "понеділок": System.out.println("Понеділок:План на день відвідати курси");
		break;
		case "вівторок": System.out.println("Ввіторок:План на день зробити домашку");
		break;
		case "середа": System.out.println("Середа:План на день відвідати курси");
		break;
		case "четвер": System.out.println("Четверг:План на день зробити домашку");
		break;
		case "пятниця": System.out.println("Пятниці:План на день відвідати курси");
		break;
		case "субота": System.out.println("Cубота:План на день детальніше розібратись в механіці Java");
		break;
		case "неділя": System.out.println("Неділя:Вихідний день час поїсти печеньки");
			default:
				System.out.println("Не тупи днів тільки 7 ");
				break;

	}
}
}
