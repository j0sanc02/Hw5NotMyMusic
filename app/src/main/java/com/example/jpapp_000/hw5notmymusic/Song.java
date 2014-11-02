package com.example.jpapp_000.hw5notmymusic;

/**
 * Created by jpapp_000 on 11/2/2014.
 */
public class Song {
    private String name;

    public Song(){}

    public Song(String name){
            this.name=name;
        }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
