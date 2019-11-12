package com.epam.model.classes;

public class Flowerpot {
    private String name;
    private String kind;
    private double price;
    private String origin;

    public Flowerpot(String name, String kind, double price, String origin) {
        this.name = name;
        this.kind = kind;
        this.price = price;
        this.origin = origin;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Flowerpot{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}' + "\n";
    }
}
