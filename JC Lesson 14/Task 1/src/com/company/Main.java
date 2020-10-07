package com.company;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;


//1) Створити клас (довільно який), описати в ньому мінімум два поля, одне з яких String, інше числове (довільно яке).
// Створити в мейн методі Set.
// Наповнити його обєктами даного класу.
// Використати Comparator і Comparable для сортування за цими полями.
// Вивести спершу невідсортований список, потім відсортований на консоль.

public class Main {

    public static void main(String[] args) {
        Comparator<ClassForSet> comparator = new ClassNumberComparator().thenComparing(new ClassStringComparator());
        Random random = new Random();
        TreeSet<ClassForSet> set = new TreeSet(comparator);
        for (int i = 0; i < 10; i++) {
            set.add(new ClassForSet((random.nextInt(10) + 1), random.toString()));
        }
        for (ClassForSet c : set) {
            System.out.println(c.getSomeNumber() + " " + c.getSomeString());
        }

    }
}
