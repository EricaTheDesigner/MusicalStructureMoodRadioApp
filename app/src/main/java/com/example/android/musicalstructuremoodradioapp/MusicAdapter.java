package com.example.android.musicalstructuremoodradioapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter (Context context, ArrayList<Music> Songs){
        super(context, 0,Songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Music my_music = getItem(position);
        TextView songNameTextView = listItemView.findViewById(R.id.song_name_text_view);
        songNameTextView.setText(my_music.getmSongName());
        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(my_music.getmSongArtist());

        return listItemView;
    }
}
