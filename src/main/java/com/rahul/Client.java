package com.rahul;
import com.rahul.pens.BallPen;
import com.rahul.pens.FountainPen;
import com.rahul.pens.GelPen;

public class Client {
    public static void main(String[] args) {
        BallPen bPen = new BallPen();
        bPen.setBrand("Renolds");
        bPen.write();
        bPen.close();
        bPen.open();

        FountainPen fPen = new FountainPen();
        System.out.println(fPen.getBrand());
        fPen.write();

        GelPen gelPen = new GelPen();
        gelPen.close();


    }
}
