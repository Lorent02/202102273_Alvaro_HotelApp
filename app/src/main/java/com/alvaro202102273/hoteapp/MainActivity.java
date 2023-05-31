package com.alvaro202102273.hoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageurl = "https://res.cloudinary.com/luxuryp/image/upload/q_auto:good,f_auto,w_1920/lmj8uvrcsrznixkfeorp.jpg";
        Picasso.with(this).load(imageurl).into(_imageView1);
    }
}