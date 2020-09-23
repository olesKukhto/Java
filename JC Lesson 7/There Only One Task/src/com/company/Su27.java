package com.company;

import java.util.Random;

public class Su27 extends SteeringOfPlane implements SpecialOption {
    Random random = new Random();
    private int maxSpeed;
    private String color;

    public Su27(int planeWidth, int planeLength, int weight , int maxSpeed ,String color ) {
        super(planeWidth, planeLength, weight);
    }
    @Override
    public void turboAcceleration() {
        System.out.println("Швидкість літака більша за максимальну на " + (random.nextInt(maxSpeed+50) + maxSpeed) );
    }

    @Override
    public void stelsTechnology() {
        System.out.println("Літак використовує технологію стелс тому його не видно протягом " + (random.nextInt(60)+1) + " секунд");
    }

    @Override
    public void nuclearStrike() {
        System.out.println("Літак скинув " + (random.nextInt(10)+1) + " ядерних боєголовок" );
    }
}
