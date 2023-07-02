package com.codeclan.example.Instruments;

public class DrumKit extends Instrument {
    private int numOfDrums;

    public DrumKit(String brand, String colour, int numOfDrums, double buyPrice, double sellPrice) {
        super(brand, InstrumentType.PERCUSSION, colour, buyPrice, sellPrice);
        this.numOfDrums = numOfDrums;
    }

    public String play() {
        return "BANG BOOM BANG!";
    }

}