package com.codeclan.example.Instruments;

public class Trumpet extends Instrument {
    public int numOfValves;

    public Trumpet(String brand, String colour, int numOfValves, double buyPrice, double sellPrice) {
        super(brand, InstrumentType.BRASS, colour, buyPrice, sellPrice);
        this.numOfValves = numOfValves;
    }

    public String play() {
        return "TOOT TOOT!";
    }

    public int getNumOfValves() {
        return numOfValves;
    }
}