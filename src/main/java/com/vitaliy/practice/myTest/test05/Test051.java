package com.vitaliy.practice.myTest.test05;

import com.vitaliy.practice.module05.Task051.*;

/**
 * Created by vitaliy on 25.02.2017.
 */
public class Test051 {
    public static void main(String[] args) {

        Room room1 = new Room(1,100,1, "Palms", "New York");
        Room room2 = new Room(1,100,1, "Palms", "New York");
        Room room3 = new Room(1,100,1, "Palms", "New York");
        Room room4 = new Room(1,100,1, "Palms", "New York");
        Room room5 = new Room(1,100,1, "Palms", "New York");

        Room[] rooms = {room1,room2,room3,room4};

        //GoogleAPI googleAPI = new GoogleAPI();

        //BookingComAPI bookingComAPI = new BookingComAPI();

        //TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        Controller controller = new Controller();

        //System.out.println(bookingComAPI.findRooms(100,1,"New York", "Palms"));


//        System.out.println(googleAPI.findRooms(100,1,"Yaremche", "Karpaty"));
//        System.out.println(tripAdvisorAPI.findRooms(1000,1,"Ibiza", "Premier Palace"));
//
        System.out.println(controller.requstRooms(1000, 1, "Ibiza", "Premier Palace"));
//        System.out.println(controller.requstRooms(100, 1, "Yaremche", "Karpaty"));
//        System.out.println(controller.requstRooms(1000, 1, "Ibiza", "Premier Palace"));

        //System.out.println(controller.requstRooms(100, 1, "New York", "Palms"));


    }
}
