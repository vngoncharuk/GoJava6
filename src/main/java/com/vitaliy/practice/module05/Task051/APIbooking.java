package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 26.02.2017.
 */
public interface APIbooking {
    Room[] findRooms(int price, int persons, String city, String hotel);
}
