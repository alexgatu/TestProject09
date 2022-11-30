package com.siit.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Building {

    private ArrayList<Floor> floors;
    private String name;

    @Override
    public String toString() {
        String out = "Building name: " + getName() + "\n";
        int totalDeskCount = 0;
        int totalSeatCount = 0;
        for (Floor f : getFloors()) {
            out = out + f.toString() + "\n";
            totalSeatCount += f.getTotalSeatCount();
            totalDeskCount += f.getTotalDeskCount();
        }
        out = out + "Total Office Desk capacity: " + totalDeskCount + "\n";
        out = out + "Total Conference Seat capacity: " + totalSeatCount + "\n";
        return out;
    }

}
