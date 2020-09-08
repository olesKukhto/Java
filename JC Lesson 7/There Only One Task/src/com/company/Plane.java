package com.company;

import java.util.Random;

public abstract class Plane {
    private int planeWidth;
    private int planeLength;
    private int weight;
    Random random = new Random();

    public Plane(int planeWidth, int planeLength, int weight) {
           this.planeWidth = planeWidth;
           this.planeLength = planeLength;
           this.weight = weight;
    }

    abstract void startEngine();
    abstract void planeFlying ();
    abstract void plainLanding();

}
