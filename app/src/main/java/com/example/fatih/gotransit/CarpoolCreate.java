package com.example.fatih.gotransit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CarpoolCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpool_create);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView;
        imageView = findViewById(R.id.imageView3);
        imageView.bringToFront();

    }

    public void createClicked(View view) {
        Intent intent = new Intent(this, Confirmation.class);
        startActivity(intent);

    }
}
