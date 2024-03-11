package com.rahul.pens;

import com.rahul.entity.Ink;
import com.rahul.entity.Nib;
import com.rahul.entity.Pen;

public class FountainPen extends Pen {

    Ink ink;
    Nib nib;

    @Override
    public void write() {
        System.out.println("Writing with fountain pen");

    }

    @Override
    public void close() {
        System.out.println("Closing fountain pen");
    }

    @Override
    public void open() {
        System.out.println("Opening fountain pen");
    }
}
