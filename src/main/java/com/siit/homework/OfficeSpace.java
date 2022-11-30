package com.siit.homework;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.SQLOutput;
import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor
public class OfficeSpace extends Room{

    private int deskCount;

    public OfficeSpace(ArrayList<String> furniture, ArrayList<String> appliances, int deskCount) {
        super(furniture, appliances);
        this.setType(RoomTypes.OFFICE_SPACE);
        this.deskCount = deskCount;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + deskCount + " desk(s)" + "\n\n";
    }

}
