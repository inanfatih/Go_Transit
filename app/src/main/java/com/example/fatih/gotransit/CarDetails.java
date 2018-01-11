package com.example.fatih.gotransit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CarDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void createClicked(View view) {
        Intent intent = new Intent(this, CarpoolCreate.class);
        startActivity(intent);

    }
}
