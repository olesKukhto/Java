package com.company;

import java.util.Random;

public class Auto {
    private int horsePower;
    private int yearProducted;
    Helm helm = new Helm();
    Engine engine = new Engine();
    Random random = new Random();

    public void setAllParameters() {
        setHorsePower();
        setYearProducted();
        engine.setQuantityOfCylindres();
        helm.setDiameterOfHelm();
        helm.setMaterialOfhelm();
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower() {
        this.horsePower = random.nextInt(10) + 1;
    }

    public int getYearProducted() {
        return yearProducted;
    }

    public void setYearProducted() {
        this.yearProducted = random.nextInt(10) + 1;
    }

    public Engine getEngine() {
        return engine;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "horsePower=" + horsePower +
                ", yearProducted=" + yearProducted +
                ", engine=" + engine.getQuantityOfCylindres() +
                ", helm=" + helm.getDiameterOfHelm() +
                ", helm=" + helm.getMaterialOfhelm() +
                '}';
    }
}
