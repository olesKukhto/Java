package com.company;

import java.util.Random;

public class Engine {
    private int quantityOfCylindres;
    Random random = new Random();

    public int getQuantityOfCylindres() {
        return quantityOfCylindres;
    }

    public void setQuantityOfCylindres() {
        this.quantityOfCylindres = random.nextInt(10) + 1;
    }


}
