package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 26.02.2017.
 */
public interface DAObooking {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
