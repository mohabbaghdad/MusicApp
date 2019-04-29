package com.example.muiscapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<customArrayList> {
    public MusicAdapter(Activity context, ArrayList<customArrayList> music) {
        super(context, 0, music);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        customArrayList currentAndroidMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.musicName_text_view);
        songNameTextView.setText(((customArrayList) currentAndroidMusic).getSongname());

        // Find the TextView in the list_item.xml layout with the ID artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(((customArrayList) currentAndroidMusic).getArtist());
        return listItemView;
    }
}

