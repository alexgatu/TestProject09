package com.siit.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Floor {
    private ArrayList<Room> rooms;
    private int floorNumber;

    public Floor(ArrayList<Room> rooms, int floorNumber) {
        this.rooms = rooms;
        this.floorNumber = floorNumber;
    }

    private int getGenericRoomTypeCount(RoomTypes rt) {
        int count = 0 ;
        for (Room r : getRooms()) {
            if(r.getType().equals(rt)) {
                count++;
            }
        }
        return count;
    }

    public int getToiletCount() {
        return getGenericRoomTypeCount(RoomTypes.TOILET);
    }

    public int getConferenceRoomCount() {
        return getGenericRoomTypeCount(RoomTypes.CONFERENCE);
    }

    public int getKitchenCount() {
        return getGenericRoomTypeCount(RoomTypes.KITCHEN);
    }

    public int getOfficeSpaceCount() {
        return getGenericRoomTypeCount(RoomTypes.OFFICE_SPACE);
    }

    public String toString() {
        String out = "Floor " + floorNumber + ": \n";
        out += "Office space count " + getOfficeSpaceCount() + "\n";
        out += "Kitchen count " + getKitchenCount() + "\n";
        out += "Conference Room count " + getConferenceRoomCount() + "\n";
        out += "Toilet count " + getToiletCount() + "\n";
        for (Room r : rooms) {
            out += r.toString();
        }
        return out + "-------------------------";
    }

    public int getTotalSeatCount() {
        int count = 0;
        for (Room r : getRooms()) {
            if(r.getType().equals(RoomTypes.CONFERENCE)) {
                count += ((ConferenceRoom)r).getSeatCount();
            }
        }
        return count;
    }

    public int getTotalDeskCount() {
        int count = 0;
        for (Room r : getRooms()) {
            if(r.getType().equals(RoomTypes.OFFICE_SPACE)) {
                count += ((OfficeSpace)r).getDeskCount();
            }
        }
        return count;
    }

}
