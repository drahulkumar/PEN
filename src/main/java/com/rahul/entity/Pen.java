package com.rahul.entity;

import com.rahul.enums.Closingtype;
import com.rahul.enums.Pentype;

public abstract  class  Pen {
    private String name;
    private String brand;
    private Double price;

    private Pentype type;
    private Closingtype ctype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Pentype getType() {
        return type;
    }

    public void setType(Pentype type) {
        this.type = type;
    }

    public Closingtype getCtype() {
        return ctype;
    }

    public void setCtype(Closingtype ctype) {
        this.ctype = ctype;
    }



    public abstract  void write();
    public abstract void  close();
    public abstract void open();
}
