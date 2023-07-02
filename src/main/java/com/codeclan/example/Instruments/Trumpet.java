package com.codeclan.example.Instruments;

public class Tuba extends Instrument {
    private int numOfDrums;

    public Tuba(String brand, String colour, int numOfDrums) {
        super(brand, InstrumentType.PERCUSSION, colour);
        this.numOfDrums = numOfDrums;
    }

    public String play() {
        return "BANG BOOM BANG!";
    }

}