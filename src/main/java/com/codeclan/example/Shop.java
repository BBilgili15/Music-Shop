package com.codeclan.example;

import com.codeclan.example.Interfaces.ISell;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public double calculateTotalMarkup() {
        double totalProfit = 0;
        for (ISell iSell: stock) {
            totalProfit += iSell.calculateMarkup();
        }
        return totalProfit;
    }
}
