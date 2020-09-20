package com.company;

import java.util.Collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList();
        List<Integer> list = new ArrayList();
        Random random = new Random();
        int rand = random.nextInt() + 1;
        for (int i = 0; i < 20;i++){
            integer.add(random.nextInt(100) + 1);
        }
        int size = integer.size();
        Collections.sort(integer);
        Collections.reverse(integer);

        for(int i = 0;i < size;i++){
            System.out.println(integer.get(i));
        }
    }
}
