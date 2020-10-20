package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//Створити сутністності Авто, Кермо, Двигун.
// Авто володіє полями : Кількість кінських сил, рік випуску.
// Кермо володіє полями : Діаметр колеса, матеріал з якого зроблено кермо (шкіра, алькантара).
// Двигун володіє полями : кількість циліндрів.
// Побудувати звязки між даними сутностями( використати композицію).
//
//
//   - Створити двовимірний масив, величина якого вираховується рандомно.
//   - Заповнити даний масив обєктами авто, всі значення конструктора якого заповнюються рандомно.
//   - Створити консольне меню, яке буде мати наступні елементи меню:
//       а) Вивести toString() даних елементів масиву на консоль. ( deepToString() )
//       б) Для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто (fill())


public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Auto> arrayAuto = new ArrayList<>();
        Auto auto;
        int randomCountOne = random.nextInt(10) + 1;
        int randomCountTwo = random.nextInt(10) + 1;
        for (int i = 0; i < randomCountOne; i++) {
            for (int j = 0; j < randomCountTwo; j++) {
                auto = new Auto();
                auto.setAllParameters();
                arrayAuto.add(auto);

            }
        }
        for (Auto auto1 : arrayAuto) {
            System.out.println(auto1);

        }


    }

}







