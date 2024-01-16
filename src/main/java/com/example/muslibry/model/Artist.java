package com.example.muslibry.model;

import java.util.HashSet;
import java.util.Set;

public class Artist {
    private String firstName;
    private String lastName;
    private String nick;

    private Set<Song> songs = new HashSet<>();
}
