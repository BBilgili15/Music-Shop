package com.codeclan.example.OtherSellables;

import com.codeclan.example.Interfaces.ISell;

public class Amplifier extends SellableItem implements ISell {
    public Amplifier() {
        super(30.00, 75.00);
    }
}
