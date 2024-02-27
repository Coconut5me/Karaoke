package com.lammyngoc.karaoke.model;

public class Song {
    private String songId;
    private String songName;
    private String singerName;

    public Song(){

    }
    public Song(String songId, String songName, String singerName) {
        this.songId = songId;
        this.songName = songName;
        this.singerName = singerName;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", singerName=" + singerName +
                '}';
    }
}
