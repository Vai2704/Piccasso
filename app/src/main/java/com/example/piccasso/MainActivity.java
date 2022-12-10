package com.example.piccasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//my impots
import com.squareup.picasso.Picasso;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
//        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);
        Picasso.get()
                .load("http://i.imgur.com/DvpvklR.png")
                .into(imageView);
    }
}