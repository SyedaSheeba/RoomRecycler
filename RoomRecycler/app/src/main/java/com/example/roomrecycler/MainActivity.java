package com.example.roomrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static MyDatabase myDatabase;
    public Button insertButton,retrieveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDatabase= Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"userdb").allowMainThreadQueries().build();
        insertButton=findViewById(R.id.insert);
        retrieveButton=findViewById(R.id.retreive);
    }
    public void insert(View view)
    {
        Intent intent=new Intent(this,InsertActivity.class);
        startActivity(intent);

    }
    public void retrieve(View view)
    {
        Intent intent=new Intent(this,RetrieveActivity.class);
        startActivity(intent);
    }
}
