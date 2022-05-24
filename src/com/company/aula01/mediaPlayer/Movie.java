package com.company.aula01.mediaPlayer;

public class Movie implements IMedia{
    private String name;
    private int id;
    String[] directors;
    double time;
    String originalLanguage;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
