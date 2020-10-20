package com.company;

import java.util.Comparator;

public class ClassStringComparator implements Comparator<ClassForSet> {


    public int compare(ClassForSet o1, ClassForSet o2) {
        return o1.getSomeString().compareTo(o2.getSomeString());
    }
}
