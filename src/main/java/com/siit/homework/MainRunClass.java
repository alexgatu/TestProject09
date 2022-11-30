package com.siit.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class MainRunClass {

    public static void main(String[] args) {

        ArrayList<String> officeFurniture = new ArrayList<>(Arrays.asList("Lockers", "Seats", "Desks", "Plants"));
        ArrayList<String> officeAppliances = new ArrayList<>(Arrays.asList("Printers", "TVs", "Laptops"));
        ArrayList<String> kitchenFurniture = new ArrayList<>(Arrays.asList("Tables", "Seats", "Storage"));
        ArrayList<String> kitchenAppliances = new ArrayList<>(Arrays.asList("CoffeeMachine", "Fridge", "WatterDispenser"));
        ArrayList<String> confFurniture = new ArrayList<>(Arrays.asList("Seats", "Desk", "Plants"));
        ArrayList<String> confAppliances = new ArrayList<>(Arrays.asList("HeatController", "SoundSystem"));
        ArrayList<String> toiletFurniture = new ArrayList<>(Arrays.asList("ToiletCabin", "Mirror", "Faucet"));
        ArrayList<String> toiletAppliances = new ArrayList<>(Arrays.asList("HeatController", "Sprinkler"));

        Room r01 = new OfficeSpace(officeFurniture, officeAppliances, 20);
        Room r02 = new Toilet(toiletFurniture, toiletAppliances);
        Room r03 = new Kitchen(kitchenFurniture, kitchenAppliances);
        Room r04 = new ConferenceRoom(confFurniture, confAppliances, 10, true, false, false);
        ArrayList<Room> roomsFl1 = new ArrayList<>(Arrays.asList(r01, r02, r02, r03, r04, r04, r04));

        Room r05 = new OfficeSpace(officeFurniture, officeAppliances, 10);
        Room r06 = new ConferenceRoom(confFurniture, confAppliances, 8, true, false, false);

        ArrayList<Room> roomsFl2 = new ArrayList<>(Arrays.asList(r05, r05, r02, r02, r03, r06, r06, r06, r06));

        Room r07 = new ConferenceRoom(confFurniture, confAppliances, 30, false, true, true);
        Room r08 = new ConferenceRoom(confFurniture, confAppliances, 10, true, false, true);
        Room r09 = new ConferenceRoom(confFurniture, confAppliances, 20, true, false, true);

        ArrayList<Room> roomsFl3 = new ArrayList<>(Arrays.asList(r02, r02, r07, r08, r08, r08, r08, r09));

        Floor floor01 = new Floor(roomsFl1, 1);
        Floor floor02 = new Floor(roomsFl2, 2);
        Floor floor03 = new Floor(roomsFl3, 3);

        ArrayList<Floor> floors = new ArrayList<>(Arrays.asList(floor01, floor02, floor03));

        Building b = new Building(floors, "Alex Building");

        System.out.println(b);
    }
}
