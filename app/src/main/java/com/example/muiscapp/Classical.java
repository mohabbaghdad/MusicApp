package com.example.muiscapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class Classical extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);
        ArrayList<customArrayList> songInfo = new ArrayList<customArrayList>();
        songInfo.add(new customArrayList("Beethoven ", "Für Elise", R.drawable.f_r_elise));
        songInfo.add(new customArrayList("Puccini ", "'O mio babbino caro' from Gianni Schicchi", R.drawable.o_mio_babbino_caro__from_gianni_schicchi));
        songInfo.add(new customArrayList("J.S. Bach", "Toccata and Fugue in D minor", R.drawable.toccata_and_fugue_in_d_minor));
        songInfo.add(new customArrayList("Beethoven", "Symphony No.5 in C minor", R.drawable.f_r_elise));
        songInfo.add(new customArrayList("Vivaldi ", "The Four Seasons", R.drawable.the_four_seasons));
        songInfo.add(new customArrayList("Bizet", "Carmen", R.drawable.carmen));
        songInfo.add(new customArrayList("Johann Strauss II", "The Blue Danube", R.drawable.the_blue_danube));
        songInfo.add(new customArrayList("Ravel ", "Boléro", R.drawable.bol_ro));

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
