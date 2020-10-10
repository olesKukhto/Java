package com.company;

import java.util.Scanner;
// Моделюємо верховну раду. Створити клас Людина, описати його наступними полями : вага, ріст, додати джентельменський набір.
// Створити клас депутат , унаслідувати його від Людини.
// Описати його такими полями: прізвище, імя, вік, хабарник(Буліановське), розмір хабаря(непередавати в конструктор).
// Додати джентельменський набір .
// Додати метод : дати хабар(), в якому передбачити наступне :

// Якщо поле хабарник false - то вивести на консоль :
// " Цей депутат не бере хабарів", якщо умова не виконується ,
// то ввести з консолі суму хабаря яку ви даєте,якщо це сума більша 5000,
// вивести на консоль " Миліція увязнить депутата", 
// якщо не більша то занести в поле класу хабар дану суму. 
// Створити клас фракція ,якому описати наступні методи :

//  додати депутата(вводимо з консолі)
//  видалити депутата(вводимо з консолі)
//  вивести всіх хабарників у фракції
//  вивести найбільшого хабарника у фракції
//  вивести всіх депутатів фракції
//  очистити всю фракцію від депутатів


public class Deputy {
    private String name;
    private String surname;
    private int age;
    private boolean bribeTaker;
    private int bribe;
    Scanner scanner = new Scanner(System.in);

    public Deputy() {

    }

    public Deputy(String name, String surname, int age, boolean bribeTaker, int bribe) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bribeTaker = bribeTaker;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean grafter) {
        this.bribeTaker = grafter;
    }

    public int getBribe() {
        return bribe;
    }

    public void setBribe(int bribe) {
        this.bribe = bribe;
    }

    @Override
    public String toString() {
        return "Депутат :" +
                "Імя - " + name + '\'' +
                ", Прізвище - " + surname + '\'' +
                ", Вік - " + age +
                ", Взяточник - " + bribeTaker +
                ", Сума взятки - " + this.bribe;
    }
}
