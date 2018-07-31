package com.example.android.musicalstructuremoodradioapp;

public class Music {
    //Line one The song name
    private String mSongName;

    //Line two Song Artist
    private String mSongArtist;

    /**
     * Create a new Music Object
     *
     * @param songName is the name of the actual song
     *
     * @param songArtist is the name of the artist
     *
     */
    //constructor name has to match Class "Music"
    public Music(String songName, String songArtist){
        mSongName = songName;
        mSongArtist = songArtist;
    }

    //Get the song name
    public String getmSongName(){return mSongName;}

    //get the song artist
    public String getmSongArtist(){return mSongArtist;}
}
