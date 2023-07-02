package com.codeclan.example.Instruments;

public class Piano extends Instrument {
    private int numOfKeys;

    public Piano(String brand, String colour, int numOfKeys, double buyPrice, double sellPrice) {
        super(brand, InstrumentType.KEYBOARD, colour, buyPrice, sellPrice);
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return "Tap tap tap";
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}