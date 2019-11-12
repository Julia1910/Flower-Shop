package com.epam.model;

import com.epam.model.classes.Bouquet;
import com.epam.model.classes.Flower;
import com.epam.model.classes.Flowerpot;

import java.util.ArrayList;

public interface Model {
    ArrayList<Flower> getAllFlowers();
    ArrayList<Flowerpot> getFlowerpots();
    ArrayList<Bouquet> getBouquets();
    String CreateBouquet(String name, Flower flowerRose, Flower flowerDaisy, Flower flowerTulip,
                       int amountRose, int amountDaisy, int amountTulip);

}
