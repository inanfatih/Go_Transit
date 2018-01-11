package com.example.fatih.gotransit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CarpoolCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpool_create);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
