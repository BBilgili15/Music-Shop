package com.codeclan.example.OtherSellables;

import com.codeclan.example.Interfaces.ISell;

public class Stool extends SellableItem implements ISell {
    public Stool() {
        super(15.00, 27.50);
    }
}
