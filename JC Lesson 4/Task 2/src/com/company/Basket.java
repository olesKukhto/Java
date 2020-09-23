package com.company;

class Basket extends Car {
    private int basketLength;
    private int basketWidth;
    private int basketHeigth;
    public Basket(int l,int w,int h){
        this.basketLength = l;
        this.basketWidth = w;
        this.basketHeigth = h;
    }
    void setBasketWidth(int width){
        this.basketWidth = width;
    }
    void setBasketHeigth(int heigth){
        this.basketHeigth = heigth;
    }
    void setBasketLength(int length){
        this.basketLength = length;
    }
    int getBasketLength(){
        return this.basketLength;
    }
    int getBasketWidth(){
        return this.basketWidth;
    }
    int getBasketHeigth(){
        return this.basketHeigth;
    }

    void allBasketSetsChanger()
    {
        this.basketHeigth = basketLength *3;
        this.basketWidth = basketWidth *3;
        this.basketLength= basketLength *4;

    }
}
