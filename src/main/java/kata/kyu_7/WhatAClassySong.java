package kata.kyu_7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WhatAClassySong {

    public static void main(String[] args) {
        System.out.println();
    }

    static class Song {
        String title;
        String artist;
        List<String> howMany = new ArrayList<>();

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int howMany(List<String> listeners) {
            listeners = listeners.stream().map(String::toLowerCase).distinct().filter(x -> !howMany.contains(x)).collect(Collectors.toList());
            howMany.addAll(listeners);
            return listeners.size();
        }
    }
}
