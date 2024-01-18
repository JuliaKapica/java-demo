package com.example.muslibry.repositories;

import com.example.muslibry.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
