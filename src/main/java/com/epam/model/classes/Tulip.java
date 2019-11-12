package com.epam.model.classes;

import com.epam.model.classes.Flower;

public class Tulip extends Flower {
    private String kind;
    private String origin;

    public Tulip(String color, double price, String kind, String origin) {
        super(color, price);
        this.kind = kind;
        this.origin = origin;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "color='" + getColor() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", kind='" + kind + '\'' +
                ", origin='" + origin + '\'' +
                '}' + "\n";
    }
}
