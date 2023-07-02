package com.codeclan.example.OtherSellables;

import com.codeclan.example.Interfaces.ISell;

public abstract class SellableItem implements ISell {
    private double buyPrice;
    private double sellPrice;

    public SellableItem(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return (sellPrice - buyPrice);
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
