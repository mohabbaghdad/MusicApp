package com.example.muiscapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {
    private ArrayList<customArrayList> songInfo = new ArrayList<customArrayList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);
        songInfo.add(new customArrayList("Led Zepplein", "immigrant", R.drawable.immigrant));
        songInfo.add(new customArrayList("METALLICA", "Nothing else Matter", R.drawable.nothing_else_matter));
        songInfo.add(new customArrayList("CREAM", "Crossroads", R.drawable.crossroads));
        songInfo.add(new customArrayList("RUSH", "The Seeker", R.drawable.the_seeker));
        songInfo.add(new customArrayList("MUSE", "Feeling Good", R.drawable.feeling_good));
        songInfo.add(new customArrayList("WHITESNAKE", "Ain't No Love In The Heart Of The City", R.drawable.ain_t_no_love_in_the_heart_of_the_city));
        songInfo.add(new customArrayList("SAXON", "Ride Like The Wind", R.drawable.ride_like_the_wind));
        songInfo.add(new customArrayList("GUN", "Word Up", R.drawable.word_up));
        songInfo.add(new customArrayList("NIRVANA", "The Man Who Sold The World", R.drawable.the_man_who_sold_the_world));

        MusicAdapter adapter = new MusicAdapter(this, songInfo);
        final ListView listView = (ListView) findViewById(R.id.play);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                customArrayList current = (customArrayList) listView.getItemAtPosition(position);
                String songName = current.getSongname();
                String Artist = current.getArtist();
                Integer Image = current.getImageId();

                Intent customArrayListIntent = new Intent(Rock.this, playingMusic.class);
                customArrayListIntent.putExtra("songName", songName);
                customArrayListIntent.putExtra("Artist", Artist);
                customArrayListIntent.putExtra("Image", Image);
                startActivity(customArrayListIntent);
            }
        });
        listView.setAdapter(adapter);
    }
}

