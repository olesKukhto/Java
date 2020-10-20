package com.company;

import java.util.Random;

public class Helm {
    private int diameterOfHelm;
    private String materialOfhelm;
    Random random = new Random();

    public int getDiameterOfHelm() {
        return diameterOfHelm;

    }

    public void setDiameterOfHelm() {
        this.diameterOfHelm = random.nextInt(10) + 1;
    }

    public String getMaterialOfhelm() {
        return materialOfhelm;
    }

    public void setMaterialOfhelm() {
        this.materialOfhelm = random.toString();
    }


}
