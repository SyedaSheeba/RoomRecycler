package com.example.roomrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {
    EditText bookIdEditText,bookNameEditText,authorNameEditText,quantityEditText;
    Button saveButton;
    public static MyDatabase myDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDatabase= Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"userdb").allowMainThreadQueries().build();
        setContentView(R.layout.activity_insert);
        bookIdEditText=findViewById(R.id.book_id);
        bookNameEditText=findViewById(R.id.book_name);
        authorNameEditText=findViewById(R.id.author_name);
        quantityEditText=findViewById(R.id.quantity);
        saveButton=findViewById(R.id.save);
    }


    public void onClick(View view)
    {
        int bookId=Integer.parseInt(bookIdEditText.getText().toString());
        String bookName=bookNameEditText.getText().toString();
        String authorName=authorNameEditText.getText().toString();
        int quantity=Integer.parseInt(quantityEditText.getText().toString());
        Book book=new Book();
        book.setBookId(bookId);
        book.setBookName(bookName);
        book.setAuthorName(authorName);
        book.setQuantity(quantity);
        MainActivity.myDatabase.dao().insert(book);
        Toast.makeText(getApplicationContext(),"insertion successful",Toast.LENGTH_SHORT).show();
        bookIdEditText.setText("");
        bookNameEditText.setText("");
        authorNameEditText.setText("");
        quantityEditText.setText("");
    }
}


