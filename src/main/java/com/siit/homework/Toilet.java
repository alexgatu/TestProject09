package com.siit.homework;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Toilet extends Room{

    public Toilet(ArrayList<String> furniture, ArrayList<String> appliances) {
        super(furniture, appliances);
        this.setType(RoomTypes.TOILET);
    }

}
