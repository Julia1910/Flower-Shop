package com.epam.model;

import com.epam.model.classes.Bouquet;
import com.epam.model.classes.Flower;
import com.epam.model.classes.Flowerpot;

import java.util.ArrayList;

public class ModelImp implements Model {
    private Domain domain;

    public ModelImp() {
        domain = new Domain();
    }

    @Override
    public ArrayList<Flower> getAllFlowers() {
        return domain.getFlowers();
    }

    @Override
    public ArrayList<Flowerpot> getFlowerpots() {
        return domain.getFlowerpots();
    }

    @Override
    public ArrayList<Bouquet> getBouquets() {
        return domain.getBouquets();
    }

    @Override
    public String CreateBouquet(String name, Flower flowerRose, Flower flowerDaisy, Flower flowerTulip,
                              int amountRose, int amountDaisy, int amountTulip) {
       return domain.createNewBouquet(name, flowerRose, flowerDaisy, flowerTulip,
                amountRose, amountDaisy, amountTulip);
    }

}
