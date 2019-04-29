package com.example.muiscapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class playingMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);
        playing();
        Button home = (Button) findViewById(R.id.home_view);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(playingMusic.this, MainActivity.class);
                startActivity(home);
            }
        });
    }

    public void playing() {
        Intent infromation = getIntent();
        Bundle bundle = getIntent().getExtras();

        TextView Song_name_TextView = findViewById(R.id.song_name_text_view);
        String songNameForPlaying = infromation.getStringExtra("songName");
        Song_name_TextView.setText(songNameForPlaying);

        TextView artist_TextView = findViewById(R.id.artist_text_view);
        String artistForPlaying = infromation.getStringExtra("Artist");
        artist_TextView.setText(artistForPlaying);

        ImageView imageView = findViewById(R.id.image_view);
        int image = bundle.getInt("Image");
        imageView.setImageResource(image);
    }
}
