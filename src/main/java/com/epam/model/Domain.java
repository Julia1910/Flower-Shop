package com.epam.model;

import com.epam.model.classes.*;

import java.util.ArrayList;

public class Domain {
    ArrayList<Flower> flowers;
    ArrayList<Flowerpot> flowerpots;
    ArrayList<Bouquet> bouquets = new ArrayList<Bouquet>();

    public ArrayList<Flower> getFlowers() {
        Rose redRose = new Rose("red", 30.0, "Patio");
        Rose whiteRose = new Rose("white", 25.5, "TeaRose");
        Daisy whiteDaisy = new Daisy("white", 10.0, "Ukraine");
        Daisy pinkDaisy = new Daisy("pink", 12.5, "England");
        Tulip redTulip = new Tulip("red", 25, "usual", "Holland");
        Tulip purpleTulip = new Tulip("purple", 28, "hybrid", "China");

        flowers = new ArrayList<Flower>();
        flowers.add(redRose);
        flowers.add(whiteRose);
        flowers.add(whiteDaisy);
        flowers.add(pinkDaisy);
        flowers.add(redTulip);
        flowers.add(purpleTulip);

        return flowers;
    }

    public ArrayList<Flowerpot> getFlowerpots() {
        Flowerpot cactus = new Flowerpot("cactus", "usual", 127.0, "France");
        Flowerpot violet = new Flowerpot("violet","hybrid", 250, "Holland");
        Flowerpot moneyTree = new Flowerpot("moneyTree","usual", 380, "USA");

        flowerpots = new ArrayList<Flowerpot>();
        flowerpots.add(cactus);
        flowerpots.add(violet);
        flowerpots.add(moneyTree);

        return flowerpots;
    }

    public void setBouquets(){
        getFlowers();
        Bouquet natural = new Bouquet("Natural", flowers.get(3), flowers.get(4), flowers.get(5),
                3, 2, 1);
        Bouquet beauty = new Bouquet("Such a beauty", flowers.get(4), flowers.get(5), flowers.get(0),
                4, 5, 6);

        if (bouquets.size() == 0){
            bouquets.add(0, natural);
            bouquets.add(1, beauty);
        }
    }

    public ArrayList<Bouquet> getBouquets() {
        setBouquets();
        return bouquets;
    }


    public String createNewBouquet(String name, Flower flowerRose, Flower flowerDaisy, Flower flowerTulip,
                                 int amountRose, int amountDaisy, int amountTulip){
        getFlowers();
        Bouquet newBouquet = new Bouquet(name, flowerRose, flowerDaisy, flowerTulip,
                amountRose, amountDaisy, amountTulip);
        bouquets.add(newBouquet);
        return "New bouquet is created. \n It costs " + newBouquet.getCost() + " uah";

    }

}
