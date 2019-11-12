package com.epam.model.classes;

import java.util.ArrayList;

public class Bouquet {
    private String name;
    private Flower flowerRose;
    private Flower flowerDaisy;
    private Flower flowerTulip;
    private int amountRose;
    private int amountDaisy;
    private int amountTulip;
    ArrayList<Flower> flowers;

    public Bouquet(String name, Flower flowerRose, Flower flowerDaisy, Flower flowerTulip,
                   int amountRose, int amountDaisy, int amountTulip) {
        this.name = name;
        this.flowerRose = flowerRose;
        this.flowerDaisy = flowerDaisy;
        this.flowerTulip = flowerTulip;
        this.amountRose = amountRose;
        this.amountDaisy = amountDaisy;
        this.amountTulip = amountTulip;
    }

    public ArrayList<Flower> getBouquet() {
        flowers = new ArrayList<Flower>();
        for (int i = 0; i <= amountRose; i++) {
            flowers.add(flowerRose);
        }

        for (int i = 0; i <= amountDaisy; i++) {
            flowers.add(flowerDaisy);
        }

        for (int i = 0; i <= amountTulip; i++) {
            flowers.add(flowerTulip);
        }
        return flowers;
    }

    public Flower getFlowerRose() {
        return flowerRose;
    }

    public void setFlowerRose(Flower flowerRose) {
        this.flowerRose = flowerRose;
    }

    public Flower getFlowerDaisy() {
        return flowerDaisy;
    }

    public void setFlowerDaisy(Flower flowerDaisy) {
        this.flowerDaisy = flowerDaisy;
    }

    public Flower getFlowerTulip() {
        return flowerTulip;
    }

    public void setFlowerTulip(Flower flowerTulip) {
        this.flowerTulip = flowerTulip;
    }

    public int getAmountRose() {
        return amountRose;
    }

    public void setAmountRose(int amountRose) {
        this.amountRose = amountRose;
    }

    public int getAmountDaisy() {
        return amountDaisy;
    }

    public void setAmountDaisy(int amountDaisy) {
        this.amountDaisy = amountDaisy;
    }

    public int getAmountTulip() {
        return amountTulip;
    }

    public void setAmountTulip(int amountTulip) {
        this.amountTulip = amountTulip;
    }

    public double getCost() {
        double priceRose = flowerRose.getPrice() * amountRose;
        double priceDaisy = flowerDaisy.getPrice() * amountDaisy;
        double priceTulip = flowerTulip.getPrice() * amountTulip;

        double sum = priceRose + priceDaisy + priceTulip;

        return sum;
    }

    public ArrayList<Flower> sortBy() {
        for (int i = 0; i < flowers.size(); i++) {
            double min = flowers.get(i).getPrice();
            int min_i = i;
            for (int j = i + 1; j < flowers.size(); j++) {
                if (flowers.get(j).getPrice() < min) {
                    min = flowers.get(j).getPrice();
                    min_i = j;
                }
            }
            if (i != min_i) {
                Flower tmp = flowers.get(i);
                flowers.set(i, flowers.get(min_i));
                flowers.set(min_i, tmp);
            }
        }
        return flowers;
    }

    @Override
    public String toString() {
        return "Bouquet{ \n" +
                "Name= " + name +
                ", First flower= " + flowerRose +
                ", Second flower= " + flowerDaisy +
                ", Third flower= " + flowerTulip +
                ", amount of first flower= " + amountRose +
                ", amount of second flower= " + amountDaisy +
                ", amount of third flower= " + amountTulip +
                ", price= " + getCost() +
                '}' + "\n";
    }
}
