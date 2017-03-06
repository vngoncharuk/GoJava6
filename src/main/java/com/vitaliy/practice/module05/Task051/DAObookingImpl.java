package com.vitaliy.practice.module05.Task051;

/**
 * Created by vitaliy on 26.02.2017.
 */
public class DAObookingImpl implements DAObooking{

    private Room[] roomDB = new Room[5];

    public Room save(Room room) {
        int count = getRoomsCount(roomDB);
        roomDB[count] = room;
        return room;
    }

    private int getRoomsCount(Room [] roomDB){
        int count = 0;
        for (Room room : roomDB) {
            if (room != null){
                count++;
            }
        }
        return count;
    }

    public boolean delete(Room room) {

        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDb = roomDB[i];
            if (room.equals(roomInDb)){
                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length - 1] = null;
            }
        }
        return true;
    }

    public Room update(Room room) {
        for (Room room1 : roomDB) {
            if (room != null && room1.getId() == room.getId()) {
                room1 = room;
            }
        }
        return null;
    }

    public Room findById(long id) {
        for (Room room : roomDB) {
            if (room != null && room.getId() == id) {
                return room;
            }
        }
        return null;
    }
}
