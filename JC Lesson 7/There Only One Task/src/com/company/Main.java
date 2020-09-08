package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        Su27 su27 = new Su27(23,32,23,23,"RED");
        su27.startEngine();
        su27.planeFlying();
        su27.moveDown();su27.moveLeft();su27.moveRight();su27.moveUp();
        su27.stelsTechnology();
        su27.nuclearStrike();
        su27.turboAcceleration();
        su27.plainLanding();


    }


}



