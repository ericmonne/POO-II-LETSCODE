package com.company.aula01.mediaPlayer;

import java.util.ArrayList;

public class MoviePlayer implements IMoviePlayer{

    ArrayList<Movie> movieList;
    String currentLanguage;
    Movie currentMovie;

    @Override
    public void movieSpeed(int speed) {
        System.out.println(currentMovie.getName() + " is at speed " + speed);
    }

    @Override
    public void subtitles(String subtitles) {
        System.out.println("Subtitles in " + subtitles);
    }

    @Override
    public void setLanguage(String language) {
        currentLanguage = language;
        System.out.println("Current language is " + currentLanguage);

    }

    @Override
    public void play(int id) {
        currentMovie = movieList.get(id);
        System.out.println("Now playing " + currentMovie.getName());
    }

    @Override
    public void pause() {
        System.out.println( currentMovie.getName() + " is paused");
    }

    @Override
    public void stop() {
        System.out.println( currentMovie.getName() + " is stopped");
    }

    @Override
    public void restart() {
        System.out.println( currentMovie.getName() + " will restart at the end");
    }

    @Override
    public void skip() {
        int index = 0;
        for (int i = 0; i < movieList.size(); i++) {
            if(currentMovie.getId() == movieList.get(i).getId()){
                index = i;
            }
        }

        if (index + 1 < movieList.size()){
            currentMovie = movieList.get(index);
            System.out.println("Playing " + currentMovie.getName());
        } else{
            currentMovie = null;
            System.out.println("No movie left to play");
        }
    }

    @Override
    public void forwards(int seconds) {
        System.out.println("Movie advanced by " + seconds + " seconds");
    }

    @Override
    public void backwards(int seconds) {
        System.out.println("Movie backed by " + seconds + " seconds");
    }

    @Override
    public void loop() {

    }
}
