package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 26.02.2017.
 */
public class Controller {
    APIbooking apis [] = new APIbooking[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        Room[] rooms = new Room[1];
        for (APIbooking api : apis) {
            if (api.findRooms(price,persons,city,hotel) != null){
                System.arraycopy(rooms,0,rooms,0,rooms.length);
            }
        }
        return rooms;
    }

//    {
//        Room[] newArrayOfFindRooms = new Room[0];
//
//        for (int i = 0; i < rooms.length; i++) {
//            Room roomInDb = rooms[i];
//
//            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {
//                Room.addRoomFromRequestToArray(newArrayOfFindRooms, rooms[i]);
//            }
//        }
//        return newArrayOfFindRooms;
//    }



    Room[] check(APIbooking api1, APIbooking api2){
        return null;//доделать

    }

}
