package com.company;

import java.util.Random;

public class SteeringOfPlane extends Plane{
    private int up;
    private int down;
    private int left;
    private int right;
    Random random = new Random();

    public SteeringOfPlane(int planeWidth, int planeLength, int weight) {
        super(planeWidth, planeLength, weight);
    }

    void moveUp(){
        this.up = random.nextInt(50) + 1;
        System.out.println("Літак рухнувся в верх на " + up + " градусів");
    }
    void moveLeft(){
        this.left = random.nextInt(50) + 1;
        System.out.println("Літак рухнувся в ліво на " + left + " градусів");
    }
    void moveRight(){
        this.right = random.nextInt(50) +1;
        System.out.println("Літак рухнувся в право на " + right + " градусів");
    }
    void moveDown(){
      this.down = random.nextInt(50 )+ 1;
        System.out.println("Літак рухнувся в вниз на " + down + " градусів");
    }

    @Override
    void startEngine() {
        System.out.println("Двигун запуститься через " + (random.nextInt(66)+22) +"хв");

    }

    @Override
    void planeFlying() {
        System.out.println("Літак пролетить - "+ (1 +random.nextFloat() * (1000 - 1)) + "км");
    }

    @Override
    void plainLanding() {
            System.out.println("Літак виконує посадку ");
        }

    }

