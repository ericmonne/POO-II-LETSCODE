package com.company.aula01.mediaPlayer;

public class Song implements IMedia{
    private int id;
    private String name;
    String[] artists;
    String[] label;
    double time;
    String genre;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
