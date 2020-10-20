package com.company;

import java.util.Comparator;

public class ClassNumberComparator implements Comparator<ClassForSet> {
    @Override
    public int compare(ClassForSet o1, ClassForSet o2) {
        if (o1.getSomeNumber() > o2.getSomeNumber())
            return 1;
        else if (o1.getSomeNumber() < o2.getSomeNumber())
            return -1;
        else return 0;

    }
}

