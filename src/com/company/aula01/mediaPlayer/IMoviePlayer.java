package com.company.aula01.mediaPlayer;

public interface IMoviePlayer extends IPlayer{
    void movieSpeed(int speed);
    void subtitles(String subtitles);
    void setLanguage(String language);

}
