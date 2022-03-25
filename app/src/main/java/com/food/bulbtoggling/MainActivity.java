package com.food.bulbtoggling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton switching;
    ImageView bulboning, bulboffing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switching = findViewById(R.id.toggleButton);
        bulboffing = findViewById(R.id.bulboff);
        bulboning = findViewById(R.id.bulbOn);

        switching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switching.getText().toString().equals("ON")) {
                    bulboffing.setVisibility(View.INVISIBLE);
                }
                else{
                    bulboffing.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}