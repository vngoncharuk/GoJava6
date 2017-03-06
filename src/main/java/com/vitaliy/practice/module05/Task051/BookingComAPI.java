package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 26.02.2017.
 */
public class BookingComAPI implements APIbooking {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(1,100,1, "Palms", "New York");
        Room room2 = new Room(2,1000,1, "Premier Palace", "Ibiza");
        Room room3 = new Room(3,1000,1, "Premier Palace", "Ibiza");
        Room room4 = new Room(4,400,4, "Palms", "New York");
        Room room5 = new Room(5,500,5, "Palms", "New York");

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

    public Room[] findRooms(int price, int persons, String city, String hotelName) {
        Room[] newArrayOfFindRooms = new Room[0];

        for (int i=0 ; i < rooms.length; i++) {
            Room roomInDb = rooms[i];
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equals(city) && rooms[i].getHotelName().equals(hotelName)) {
                newArrayOfFindRooms = Room.addRoomFromRequestToArray(newArrayOfFindRooms, roomInDb);
            }
        }
        return newArrayOfFindRooms;
    }

    public Room[] getAllRooms() {
        Room[] allRooms = new Room[0];
        for (Room room : rooms) {
            allRooms = Room.addRoomFromRequestToArray(allRooms, room);
        }
        return allRooms;
    }

}
