package com.epam.model.classes;

import com.epam.model.classes.Flower;

public class Rose extends Flower {
    private String kind;


    public Rose(String color, double price, String kind) {
        super(color, price);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + getColor() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", kind='" + kind + '\'' +
                '}' + "\n";
    }
}
