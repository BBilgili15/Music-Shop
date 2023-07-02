package com.codeclan.example.OtherSellables;

import com.codeclan.example.Interfaces.ISell;

public class DrumSticks extends SellableItem implements ISell {
    public DrumSticks() {
        super(5.00, 10.00);
    }
}
