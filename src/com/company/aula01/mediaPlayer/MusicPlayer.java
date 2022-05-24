package com.company.aula01.mediaPlayer;

import java.util.ArrayList;

public class MusicPlayer implements IMusicPlayer{

    ArrayList<Song> playList;
    Song currentSong;

    @Override
    public void play(int id) {
        currentSong = playList.get(id);

        System.out.println("Playing " + currentSong.getName());
    }

    @Override
    public void pause() {
        System.out.println(currentSong.getName() + " paused");
    }

    @Override
    public void stop() {
        System.out.println(currentSong + " stopped");
    }

    @Override
    public void restart() {
        System.out.println(currentSong + " restarted");
    }

    @Override
    public void skip() {
        int index = 0;
        for (int i = 0; i < playList.size(); i++) {
            if(currentSong.getId() == playList.get(i).getId()){
                index = i;
            }
        }

        if (index + 1 < playList.size()){
            currentSong = playList.get(index);
            System.out.println("Playing " + currentSong.getName());
        } else{
            currentSong = null;
            System.out.println("No song left to play");
        }
    }

    @Override
    public void forwards(int seconds) {
        System.out.println("Song advanced by " + seconds + " seconds");
    }

    @Override
    public void backwards(int seconds) {
        System.out.println("Song backed by " + seconds + " seconds");
    }

    @Override
    public void loop() {
        System.out.println("Repeating song " + currentSong.getName());
    }

    public MusicPlayer(){
        currentSong = null;
    }

    @Override
    public void returnArtists(){
        System.out.println("Artists in " + currentSong.getName() + " are: ");
        for(String artist : currentSong.artists){
            System.out.println(artist);
        }
    }

    @Override
    public void displayTime(){
        double mins = Math.floor(currentSong.time / 60);
        double seconds = currentSong.time % 60;
        System.out.println("Song " + currentSong.getName() + " has " + mins + ":" + seconds);
    }
}
