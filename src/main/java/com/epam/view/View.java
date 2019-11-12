package com.epam.view;

import com.epam.controller.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View  {

    private Controller controller;
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner input = new Scanner(System.in);

    public View() {
        controller = new ControllerImp();
        menu = new LinkedHashMap<String, String>();
        menu.put("1", "  1 - Show all flowers");
        menu.put("2", "  2 - Show all flowerpots");
        menu.put("3", "  3 - Show all bouquets");
        menu.put("4", "  4 - Create new bouquet");
        menu.put("Q", "  Q - exit");

        methodsMenu = new LinkedHashMap<String, Printable>();
        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
        methodsMenu.put("4", this::pressButton4);
    }

    private void pressButton1() {
        System.out.println(controller.getAllFlowers());
    }

    private void pressButton2() {
        System.out.println(controller.getFlowerpots());
    }

    private void pressButton3() {
       System.out.println(controller.getBouquets());
    }

    private void pressButton4() {
        System.out.println("Enter name of bouquet: ");
        String name = input.nextLine();
        pressButton1();
        System.out.println("Choose first flower. Enter index from 1 to 6:  ");
        int firstIndex = input.nextInt() - 1;
        System.out.println("How many you want to add?");
        int firstAmount = input.nextInt();
        System.out.println("Choose second flower. Enter index from 1 to 6: ");
        int secondIndex = input.nextInt() - 1;
        System.out.println("How many you want to add?");
        int secondAmount = input.nextInt();
        System.out.println("Choose third flower. Enter index from 1 to 6: ");
        int thirdIndex = input.nextInt() - 1;
        System.out.println("How many you want to add?");
        int thirdAmount = input.nextInt();
        System.out.println(controller.CreateBouquet(name, controller.takeFlower(firstIndex), controller.takeFlower(secondIndex),
                controller.takeFlower(thirdIndex), firstAmount, secondAmount, thirdAmount));
    }

    //-------------------------------------------------------------------------

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = input.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }
}



