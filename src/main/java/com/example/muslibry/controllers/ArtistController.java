package com.example.muslibry.controllers;

import com.example.muslibry.repositories.ArtistRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtistController {

    private ArtistRepository artistRepository;

    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @RequestMapping(value = {"/artists","/artist/list"})
    public String getArtists(Model model) {

        model.addAttribute("artists", artistRepository.findAll());
        return "artist/list";
    }
}
