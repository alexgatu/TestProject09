package com.siit.homework;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ConferenceRoom extends Room {

    private int seatCount;
    private boolean hasTv;
    private boolean hasProjector;
    private boolean hasTelepresence;

    public ConferenceRoom(ArrayList<String> furniture, ArrayList<String> appliances,
                          int seatCount, boolean hasTv, boolean hasProjector, boolean hasTelepresence) {
        super(furniture, appliances);
        this.setType(RoomTypes.CONFERENCE);
        this.seatCount = seatCount;
        this.hasProjector = hasProjector;
        this.hasTv = hasTv;
        this.hasTelepresence = hasTelepresence;
    }

    @Override
    public String toString(){
        String out = super.toString();
        out = out + "\n" + seatCount + " seat(s) ";
        if (hasTv) {
            out += "\nConference room has TV";
        }
        if (hasProjector) {
            out += "\nConference room has Projector";
        }
        if (hasTelepresence) {
            out += "\nConference room has TelePresence Device";
        }
        return out + "\n\n";
    }

}
