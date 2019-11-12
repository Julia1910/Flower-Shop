package com.epam.model.classes;

public class Daisy extends Flower {
    private String origin;

    public Daisy(String color, double price, String origin) {
        super(color, price);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Daisy{" +
                "color='" + getColor() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", origin='" + origin + '\'' +
                '}' + "\n";
    }
}
