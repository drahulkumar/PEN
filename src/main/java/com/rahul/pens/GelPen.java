package com.rahul.pens;

import com.rahul.Refillable;
import com.rahul.entity.Pen;

public class GelPen extends Pen implements Refillable {

    @Override
    public void write() {
        System.out.println("Writing with gel pen");
    }

    @Override
    public void close() {
        System.out.println("Closing gel pen");
    }

    @Override
    public void open() {
        System.out.println("Opening gel pen");
    }

    @Override
    public void Refill() {
        System.out.println("Refilling gel pen");
    }
}
