package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fraction {
    String nameOfFraction;
    List<Deputy> deputyList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Fraction() {
    }

    public Fraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    public void addDeputy(String name, String surname, int age, boolean bribe) {
        deputyList.add(new Deputy(name, surname, age, bribe, 0));
    }

    public void removeDeputy(int index) {
        deputyList.remove(index);
    }

    public void listOfDeputy() {
        for (Deputy d : deputyList) {
            System.out.println(d);
        }
    }

    public void removeAllDeputy() {
        deputyList.clear();
    }

    public void bribeTaker(Boolean b) {
        if (!b) {
            System.out.println("Цей депутат не бере хабарів");
        } else {
            System.out.println("Цей депутат хабарник");
        }
        if (b) {
            System.out.println("Дати хабаря");
            boolean yesOrNo = scanner.nextBoolean();
            if (yesOrNo) {
                int sumOfBribeMoreOrNot = scanner.nextInt();
                deputyList.get(deputyList.size() - 1).setBribe(sumOfBribeMoreOrNot);
                if (sumOfBribeMoreOrNot > 5000) {
                    System.out.println("поліція увязнить хабарника ");
                }
            }
        }
    }

    public void fractionMenu() {
        boolean booleanForMenu = true;
        while (booleanForMenu) {

            System.out.println(" 1. Додати депутата \n 2. Видалити депутата \n 3. Cписок депутатів \n" +
                    " 4. Очистити фракцію \n 5. До попереднього меню \n Exit - вихід");
            String menuNumber = scanner.next();
            switch (menuNumber) {
                case "1":
                    System.out.println("Ввести параметри");
                    boolean someBooleanToAddThisParameter = random.nextBoolean();
                    addDeputy(scanner.next(),
                            scanner.next(), scanner.nextInt(), someBooleanToAddThisParameter);
                    bribeTaker(someBooleanToAddThisParameter);
                    break;
                case "2":
                    System.out.println("Введіть новер депутата");
                    int numberOfDeputy = scanner.nextInt();
                    removeDeputy(numberOfDeputy - 1);
                    break;
                case "3":
                    listOfDeputy();
                    break;
                case "4":
                    removeAllDeputy();
                    break;
                case "5":
                    booleanForMenu = false;
                    break;
                case "Exit":
                    System.exit(1);
            }
        }
    }

    @Override
    public String toString() {
        return "Фракція:" +
                "Назва - " + nameOfFraction;
    }

}
