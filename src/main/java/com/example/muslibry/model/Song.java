package com.example.muslibry.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String rokWydania;
    @ManyToOne
    private Publisher publisher;
    @ManyToMany
    private Set<Artist> artists = new HashSet<>();

    public Song( String title, String genre, String ismn, String rokWydania, Publisher publisher) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.rokWydania = rokWydania;
        this.publisher = publisher;
    }
    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return rokWydania;
    }

    public void setYear(String rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Song{" +

                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", ismn='" + ismn + '\'' +
                ", rokWydania='" + rokWydania + '\'' +
                ", publisher='" + publisher + '\'' +
                ", artists=" + artists +
                ", id=" + id +
                '}';
    }
}

