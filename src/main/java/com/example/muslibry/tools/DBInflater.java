package com.example.muslibry.tools;

import com.example.muslibry.model.Artist;
import com.example.muslibry.model.Publisher;
import com.example.muslibry.model.Song;
import com.example.muslibry.repositories.ArtistRepository;
import com.example.muslibry.repositories.PublisherRepository;
import com.example.muslibry.repositories.SongRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    private SongRepository songRepository;
    private ArtistRepository artistRepository;
    private PublisherRepository publisherRepository;

    public DBInflater(SongRepository songRepository, ArtistRepository artistRepository, PublisherRepository publisherRepository) {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Artist Podsiadlo = new Artist("Dawid", "Podsiadło", "Podsiadło");
        Publisher sanah = new Publisher("sanah");
        Song diable = new Song("Diable", "Pop", "1234567", "2023", sanah);

        Podsiadlo.getSongs().add(diable);
        diable.getArtists().add(Podsiadlo);

        publisherRepository.save(sanah);
        artistRepository.save(Podsiadlo);
        songRepository.save(diable);

        Artist Keys = new Artist("Alicia", "Keys", "Keys");
        Publisher universalMusic = new Publisher("Universal Music");
        Song empireStateOfMind = new Song("Empire State Of Mind", "Pop", "11111", "2009", universalMusic );

        Keys.getSongs().add(empireStateOfMind);
        empireStateOfMind.getArtists().add(Keys);

        publisherRepository.save(universalMusic);
        artistRepository.save(Keys);
        songRepository.save(empireStateOfMind);

        Artist Lamar = new Artist("Kendrick", "Lamar", "lamar");
        Publisher topDawg = new Publisher("Top Dawg");
        Song humble = new Song("HUMBLE", "Hip-hop", "7654321", "2017", topDawg);

        Lamar.getSongs().add(humble);
        humble.getArtists().add(Lamar);

        publisherRepository.save(topDawg);
        artistRepository.save(Lamar);
        songRepository.save(humble);

    }
}
