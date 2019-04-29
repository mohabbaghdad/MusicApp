package com.example.muiscapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView classical_music = (TextView) findViewById(R.id.classical);
        classical_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classical = new Intent(MainActivity.this, Classical.class);
                startActivity(classical);
            }
        });
        TextView rock_music = (TextView) findViewById(R.id.rock);
        rock_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rock = new Intent(MainActivity.this, Rock.class);
                startActivity(rock);
            }
        });
        TextView pop_music = (TextView) findViewById(R.id.pop);
        pop_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop = new Intent(MainActivity.this, Pop.class);
                startActivity(pop);
            }
        });
    }
}
