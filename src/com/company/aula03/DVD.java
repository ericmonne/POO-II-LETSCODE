package com.company.aula03;

public class DVD extends Media{

    boolean hasDamages;
    int storage;
    String[] languages;


    public boolean isHasDamages() {
        return hasDamages;
    }

    public int getStorage() {
        return storage;
    }


    @Override
    public String[] getLanguage() {
        return languages;
    }

    public DVD(String type, int id, String title, String author, String publisher, boolean hasDamages, int storage, String[] languages) {
        super(type, id, title, author, publisher);
        this.hasDamages = hasDamages;
        this.storage = storage;
        this.languages = languages;
    }

    public DVD() {
    }
}
