package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 26.02.2017.
 */
public class Controller {
    private APIbooking apis [] = new APIbooking[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotelName){
        Room[] rooms = new Room[0];
        for (APIbooking api : apis) {
            Room[] apiRooms = api.findRooms(price, persons, city, hotelName);
            if (apiRooms != null){
                for (Room room : apiRooms) {
                    rooms = Room.addRoomFromRequestToArray(rooms, room);
                }
            }
        }
        return rooms;
    }

    public Room[] check(APIbooking api1, APIbooking api2){
        Room[] equalRooms = new Room[0];

        for (Room room1 : api1.getAllRooms()) {
            for (Room room2 : api2.getAllRooms()) {
                if (room1.equals(room2)){
                    equalRooms = Room.addRoomFromRequestToArray(equalRooms, room1);
                    equalRooms = Room.addRoomFromRequestToArray(equalRooms, room2);
                }
            }
        }
        return equalRooms;
    }

}
