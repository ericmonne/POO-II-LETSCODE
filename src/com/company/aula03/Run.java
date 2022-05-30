package com.company.aula03;

import java.util.ArrayList;
import java.util.List;

public class Run {

    private static void listPrinter(ArrayList<?> list){
        for(Object item : list){
            System.out.println(item);
        }
    }

    private static <T> void alternativeListPrinter(ArrayList<T> list){
        for(Object item : list){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        ArrayList<Media> inStoreMedia = new ArrayList<>();
        inStoreMedia.add(new DVD());
        inStoreMedia.add(new Cassette());

        ArrayList<String> randomNames = new ArrayList<>();
        randomNames.add("juca");
        randomNames.add("marcela");
        randomNames.add("zoroastra");
        randomNames.add("venusta");
        listPrinter(randomNames);
        alternativeListPrinter(randomNames);

        DVD avengers = new DVD("action", 2, "Avengers", "Wheedon", "Disney", true, 16, new String[]{"english", "portuguese"});

        //MediaManager<Cassette> cassetteMediaManager = new MediaManager<>(avengers);
        MediaManager<DVD> DVDMediaManager = new MediaManager<>(avengers);
        DVDMediaManager.printData();
    }
    public class Aula {
        <T, U> void genericParameter(T param, U another) {
            System.out.println(param);
            System.out.println(another);
        }
    }
}
