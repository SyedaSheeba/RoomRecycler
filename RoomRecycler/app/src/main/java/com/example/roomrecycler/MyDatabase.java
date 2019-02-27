package com.example.roomrecycler;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = Book.class, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract Dao dao();
}
