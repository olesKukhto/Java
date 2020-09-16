package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList();
        Random random = new Random();
        int rand = random.nextInt(10) + 1;
        for (int i = 0; i < rand;i++){
            integer.add(random.nextInt());
        }
        int size = integer.size();
        
    }
}
