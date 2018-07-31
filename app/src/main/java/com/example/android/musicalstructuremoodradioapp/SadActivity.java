package com.example.android.musicalstructuremoodradioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of words
        ArrayList<Music> words = new ArrayList<Music>();

        //words.add("one");
        words.add(new Music("Song Name", "Artist"));
        words.add(new Music("Song Name", "Artist"));
        words.add(new Music("Song Name", "Artist"));
        words.add(new Music("Song Name", "Artist"));
        words.add(new Music("Song Name", "Artist"));
        words.add(new Music("Song Name", "Artist"));
        words.add(new Music("Song Name", "Artist"));
        words.add(new Music("Song Name", "Artist"));

// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}