package com.example.muiscapp;

public class customArrayList {
    private String mArtist;
    private String mSongname;
    private int mImageId;

    public customArrayList(String artist, String songname,int imageid) {
        mArtist = artist;
        mSongname = songname;
        mImageId=imageid;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getSongname() {
        return mSongname;
    }
}
