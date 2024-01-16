package com.example.muslibry.model;

import java.util.HashSet;
import java.util.Set;

public class Song {
    private String title;

    private String genre;
    private String ismn;
    private String year;
    private String publisher;

//private zeby pozniej get/set to enkapsulacja
    // III Musilibry Section 2 - 16:49
    //    metoda dostepu do pol
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsmn() {
        return ismn;
    }

    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    private Set<Artist> artists = new HashSet<>(); /** przechowywanie obiekow klasy artist **/
}
