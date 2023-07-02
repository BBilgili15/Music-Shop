package com.codeclan.example.Instruments;

public class Guitar extends Instrument {
    private GuitarType type;
    private int numOfStrings;

    public Guitar(String brand, String colour, GuitarType type, int numOfStrings, double buyPrice, double sellPrice) {
        super(brand, InstrumentType.STRING, colour, buyPrice, sellPrice);
        this.type = type;
        this.numOfStrings = numOfStrings;
    }

    public String play() {
        return "Strummmm";
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public GuitarType getGuitarType() {
        return type;
    }
}
