package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 26.02.2017.
 */
public class GoogleAPI implements APIbooking {
    Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(1,100,1, "Karpaty", "Yaremche");
        Room room2 = new Room(2,150,2, "Karpaty", "Yaremche");
        Room room3 = new Room(3,200,3, "Karpaty", "Yaremche");
        Room room4 = new Room(4,250,4, "Karpaty", "Yaremche");
        Room room5 = new Room(5,300,5, "Palms", "Yaremche");

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] newArrayOfFindRooms = new Room[0];

        for (int i=0 ; i < rooms.length; i++) {
            Room roomInDb = rooms[i];

            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {
                Room.addRoomFromRequestToArray(newArrayOfFindRooms, rooms[i]);
            }
        }
        return newArrayOfFindRooms;
    }
}
