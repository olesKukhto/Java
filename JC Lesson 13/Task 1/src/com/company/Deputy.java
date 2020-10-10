package com.company;

import java.util.Scanner;

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
