package com.company;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

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
