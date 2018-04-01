package com.example.trailmix;

/**
 * Created by andrewgoering on 3/31/18.
 */

public class Song implements Comparable {
    private int time;
    private String id;

    public Song() {
        time = 0;
        this.id = "";
    }

    public Song(int time) {
        this.time = time;
        this.id = "";
    }

    public Song(String id, int time) {
        this.time = time;
        this.id = id;
    }

    public String toString() {
        return "" + time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Song)
            return time - ((Song)o).getTime();
        else
            throw new ClassCastException("Song object expected");
    }

    public Song copy() {
        return new Song(time);
    }

}