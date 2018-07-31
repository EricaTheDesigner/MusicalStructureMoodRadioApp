package com.example.android.musicalstructuremoodradioapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter (Context context, ArrayList<Music> Songs){
        super(context, 0,Songs);
    }

    @Override
    public view getView(int position, View convertView, ViewGroup parent){

        //Check if the existing view is being reused, otherwise inflate the view

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Music my_music = getItem(position);
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        songNameTextView.setText(my_music.getmSongName());
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        songNameTextView.setText(my_music.getmArtistName());

        return listItemView;
    }
}
