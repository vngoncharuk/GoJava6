package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();

        System.out.println(controller.requestRooms(1000, 1, "Ibiza", "Premier Palace"));
        System.out.println(controller.requestRooms(150, 2, "Yaremche", "Karpaty"));
        System.out.println(controller.requestRooms(5000, 5, "Ibiza", "Premier Palace"));

        System.out.println(bookingComAPI.findRooms(1000, 1, "Ibiza", "Premier Palace"));
        System.out.println(tripAdvisorAPI.findRooms(150, 2, "Yaremche", "Karpaty"));
        System.out.println(googleAPI.findRooms(5000, 5, "Ibiza", "Premier Palace"));
    }
}
