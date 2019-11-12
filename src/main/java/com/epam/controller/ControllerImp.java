package com.epam.controller;

import com.epam.model.*;
import com.epam.model.classes.Bouquet;
import com.epam.model.classes.Flower;
import com.epam.model.classes.Flowerpot;

import java.util.ArrayList;

public class ControllerImp implements Controller {
    private Model model;

    public ControllerImp() {
        model = new ModelImp();
    }

    @Override
    public ArrayList<Flower> getAllFlowers() {
        return model.getAllFlowers();
    }

    @Override
    public Flower takeFlower(int i) {
        return model.getAllFlowers().get(i);
    }

    @Override
    public String getFlower(int i) {
        return String.valueOf(model.getAllFlowers().get(i));
    }

    @Override
    public ArrayList<Flowerpot> getFlowerpots() {
        return model.getFlowerpots();
    }

    @Override
    public String getFlowerpot(int i) {
        return String.valueOf(model.getFlowerpots().get(i));
    }

    @Override
    public ArrayList<Bouquet> getBouquets() {
        return model.getBouquets();
    }

    @Override
    public String getBouquet(int i) {
        return String.valueOf(model.getBouquets().get(i));
    }

    @Override
    public String CreateBouquet(String name, Flower flowerRose, Flower flowerDaisy, Flower flowerTulip,
                              int amountRose, int amountDaisy, int amountTulip) {
       return model.CreateBouquet(name, flowerRose, flowerDaisy, flowerTulip,
                amountRose, amountDaisy, amountTulip);

    }
}
