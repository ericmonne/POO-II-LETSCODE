package com.company.aula03;

public class MediaManager <T extends Media>{
    T receivedMedia;
    public void printData(){
        System.out.println(receivedMedia.getAuthor());
        System.out.println(receivedMedia.getTitle());
    }

    public MediaManager(T media){
        this.receivedMedia = media;
    }
}
