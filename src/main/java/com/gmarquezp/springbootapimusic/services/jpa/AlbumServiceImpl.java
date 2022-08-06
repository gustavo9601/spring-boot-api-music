package com.gmarquezp.springbootapimusic.services.jpa;

import com.gmarquezp.springbootapimusic.entities.Album;
import com.gmarquezp.springbootapimusic.repositories.AlbumsRepository;
import com.gmarquezp.springbootapimusic.services.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    private AlbumsRepository albumsRepository;

    @Override
    public List<Album> buscarTodos() {
        return this.albumsRepository.findAll();
    }

    @Override
    public Optional<Album> encontrarPorId(Long id) {
        return this.albumsRepository.findById(id);
    }

    @Override
    public Album guardar(Album album) {
        return this.albumsRepository.save(album);
    }

    @Override
    public Album eliminar(Long id) {
        Optional<Album> album = this.encontrarPorId(id);
        if (album.isPresent()) {
            this.albumsRepository.deleteById(id);
            return album.get();
        }
        return null;
    }


}
