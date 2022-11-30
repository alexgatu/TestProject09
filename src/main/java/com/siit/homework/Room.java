package com.siit.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Room {

    private ArrayList<String> furniture;
    private ArrayList<String> appliances;
    private RoomTypes type;

    public Room(ArrayList<String> furniture, ArrayList<String> appliances) {
        this.appliances = appliances;
        this.furniture = furniture;
    }
    // To be overwritten
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------\n").append("--> Room Type: ").append(getType());
        sb.append("\n");
        sb.append("Furniture: ");
        for (String item : getFurniture()) {
            sb.append(item).append(" ");
        }
        sb.append("\n");
        sb.append("Appliances: ");
        for (String appliance : getAppliances()) {
            sb.append(appliance).append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }
}
