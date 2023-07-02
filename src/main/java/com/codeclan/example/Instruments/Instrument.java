package com.codeclan.example.Instruments;

import com.codeclan.example.Interfaces.IPlay;
import com.codeclan.example.Interfaces.ISell;

import javax.swing.*;

public abstract class Instrument implements IPlay, ISell {
    private String brand;
    private InstrumentType type;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String brand, InstrumentType type, String colour, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.type = type;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public abstract String play();

    public double calculateMarkup() {
        return (sellPrice - buyPrice);
    }

    public String getBrand() {
        return brand;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
