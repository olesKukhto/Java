package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Parliament {
    Scanner scanner = new Scanner(System.in);
    List<Fraction> fractionList = new LinkedList<>();

    public void addFraction(String name) {
        fractionList.add(new Fraction(name));
    }

    public void removeFraction(int index) {
        fractionList.remove(index);
    }

    public void enterToFraction(int index) {
        fractionList.get(index).fractionMenu();
    }

    public void showAllFraction() {
        int index = 0;
        for (Fraction f : fractionList) {
            index++;
            System.out.println("Фракція номер " + index+":"+ f);
        }
    }

    public void parliamentMenu() {
        while (true) {
            System.out.println(" 1. Додати фракцію \n 2. Додати фракцію та депутатів \n " +
                    "3. Всі депутати фракції \n 4. Список фракцій \n 5. Видалити фракцію " +
                    "\n exit - Вийти");
            String menuNumber = scanner.next();
            switch (menuNumber) {
                case "1":
                    System.out.println("Введіть назву фракції");
                    addFraction(scanner.next());
                    break;
                case "2":
                    System.out.println(" Ввести назву фракції");
                    addFraction(scanner.next());
                    enterToFraction(fractionList.size() - 1);
                    break;
                case "3":
                    showAllFraction();
                    int fractionIndex = scanner.nextInt();
                    System.out.println(" Депутати фракції " + fractionList.get(fractionIndex - 1));
                    fractionList.get(fractionIndex - 1).listOfDeputy();
                    break;
                case "4":
                    showAllFraction();
                    break;
                case "5":showAllFraction();
                    removeFraction(scanner.nextInt() - 1);
                    break;
                case "Exit":
                    System.exit(1);
            }
        }
    }
}
