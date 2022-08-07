package com.gmarquezp.springbootapimusic.repositories;

import com.gmarquezp.springbootapimusic.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumsRepository extends JpaRepository<Album, Long> {
}
