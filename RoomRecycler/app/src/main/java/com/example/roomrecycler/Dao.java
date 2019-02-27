package com.example.roomrecycler;

import java.util.List;

import androidx.room.Insert;
import androidx.room.Query;
@androidx.room.Dao
public interface Dao
{
    @Insert
    public void insert(Book book);

    @Query("select * from Book")
    public List<Book> retrieve();
}
