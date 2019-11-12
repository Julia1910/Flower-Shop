package com.epam.controller;

import com.epam.model.classes.*;

import java.util.ArrayList;

public interface Controller {
    ArrayList<Flower> getAllFlowers();
    Flower takeFlower(int i);
    String getFlower(int i);
    ArrayList<Flowerpot> getFlowerpots();
    String getFlowerpot(int i);
    ArrayList<Bouquet> getBouquets();
    String getBouquet(int i);
    String CreateBouquet(String name, Flower flowerRose, Flower flowerDaisy, Flower flowerTulip,
                       int amountRose, int amountDaisy, int amountTulip);

}
