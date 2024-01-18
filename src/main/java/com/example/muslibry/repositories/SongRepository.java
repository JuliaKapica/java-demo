package com.example.muslibry.repositories;

import com.example.muslibry.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
