package com.rahul.pens;

import com.rahul.Refillable;
import com.rahul.entity.Pen;

public class BallPen extends Pen implements Refillable {


    @Override
    public void write(){
        System.out.println("Writing with ball pen");
    }

    @Override
    public void close() {
        System.out.println("Closing ball pen");
    }

    @Override
    public void open() {
        System.out.println("Opening ball pen");
    }

    @Override
    public void Refill() {
        System.out.println("Ball pen is getting refilled");
    }
}
