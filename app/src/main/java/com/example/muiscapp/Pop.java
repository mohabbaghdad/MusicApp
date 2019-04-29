package com.example.muiscapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Pop extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);
        ArrayList<customArrayList> songInfo = new ArrayList<customArrayList>();
        songInfo.add(new customArrayList("Jonas Brothers", "Sucker", R.drawable.sucker));
        songInfo.add(new customArrayList("Sam Smith & Normani ", "Dancing With A Stranger ", R.drawable.dancing_with_a_stranger));
        songInfo.add(new customArrayList("Ariana Grande ", "7 Rings", R.drawable.ain_t_no_love_in_the_heart_of_the_city));
        songInfo.add(new customArrayList("Ariana Grande ", "Break Up With Your Girlfriend, I'm Bored ", R.drawable.break_up_with_your_girlfriend__i_m_bored));
        songInfo.add(new customArrayList("Ava Max", "Sweet But Psycho", R.drawable.sweet_but_psycho));
        songInfo.add(new customArrayList("Post Malone", "Wow", R.drawable.wow));
        songInfo.add(new customArrayList("Ellie Goulding X Diplo Featuring Swae Lee ", "Close To Me", R.drawable.close_to_me));
        songInfo.add(new customArrayList("Halsey", "Without Me ", R.drawable.without_me));
        songInfo.add(new customArrayList("benny blanco, Halsey & Khalid ", "Eastside ", R.drawable.eastside));

        MusicAdapter adapter = new MusicAdapter(this, songInfo);
        ListView listView = (ListView) findViewById(R.id.play);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        customArrayList current = (customArrayList) adapterView.getItemAtPosition(position);
        String songName = current.getSongname();
        String Artist = current.getArtist();
        Integer Image = current.getImageId();

        Intent customArrayListIntent = new Intent(this, playingMusic.class);
        customArrayListIntent.putExtra("songName", songName);
        customArrayListIntent.putExtra("Artist", Artist);
        customArrayListIntent.putExtra("Image", Image);
        startActivity(customArrayListIntent);
    }

}
