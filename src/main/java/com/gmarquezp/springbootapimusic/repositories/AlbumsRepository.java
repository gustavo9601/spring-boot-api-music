package com.gmarquezp.springbootapimusic.repositories;

import com.gmarquezp.springbootapimusic.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Album, Long> {
}
