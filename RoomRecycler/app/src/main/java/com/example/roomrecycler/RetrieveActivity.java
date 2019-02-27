package com.example.roomrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class RetrieveActivity extends AppCompatActivity {
    public static MyDatabase myDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);
        RecyclerView recyclerView=findViewById(R.id.retrieve_layout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Book> books=MainActivity.myDatabase.dao().retrieve();
        String retrievedData="";
        String[] data=new String[6];
        int i=0;
        for(Book book:books)
        {

            int bookId=book.getBookId();
            String bookName=book.getBookName();
            String authorName=book.getAuthorName();
            int quantity=book.getQuantity();
            retrievedData="\n\nBookId: "+bookId+"\nBookName: "+bookName
                    +"\nAuthorName: "+authorName+"\nQuantity: "+quantity;
            data[i]=retrievedData;
            i++;
        }
        recyclerView.setAdapter(new Adaptor(data));
    }
}
