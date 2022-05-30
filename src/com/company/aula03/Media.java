package com.company.aula03;

public abstract class Media {
    protected String type;
    protected int id;
    protected String title;
    protected String author;
    protected String publisher;

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public abstract <T> T getLanguage();

    public Media(String type, int id, String title, String author, String publisher) {
        this.type = type;
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Media() {
    }
}
