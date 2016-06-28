package com.mmmd.maher.fitnesstracker;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseTitle = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView)findViewById(R.id.exerciseImage);
    }
}
