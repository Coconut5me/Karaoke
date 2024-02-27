package com.lammyngoc.karaoke.model;

import java.util.ArrayList;

public class Love {
    private ArrayList<Song> loveSongs;

    public Love() {
        loveSongs = new ArrayList<>();
    }

    public void addSong(Song song) {
        loveSongs.add(song);
    }
    public void removeSong(Song song) {
        loveSongs.remove(song);
    }
    public ArrayList<Song> getAllSongs() {
        return loveSongs;
    }


}
