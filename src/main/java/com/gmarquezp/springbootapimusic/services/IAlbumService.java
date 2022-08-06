package com.gmarquezp.springbootapimusic.services;

import com.gmarquezp.springbootapimusic.entities.Album;

import java.util.List;
import java.util.Optional;

public interface IAlbumService {

    List<Album> buscarTodos();

    Optional<Album> encontrarPorId(Long id);

    Album guardar(Album album);

    Album eliminar(Long id);
}
