package com.company.aula03;

public class Cassette extends Media{

    private boolean isRewound;

    private String language;

    public boolean getIRewound(){
        return isRewound;
    }

    public String getLanguage() {
        return language;
    }

    public Cassette(String type, int id, String title, String author, String publisher, boolean isRewound, String language) {
        super(type, id, title, author, publisher);
        this.isRewound = isRewound;
        this.language = language;
    }

    public Cassette() {
    }
}
