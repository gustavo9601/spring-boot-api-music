package com.gmarquezp.springbootapimusic.controllers;

import com.gmarquezp.springbootapimusic.entities.Album;
import com.gmarquezp.springbootapimusic.services.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
class AlbumsController {
    @Autowired
    private IAlbumService albumService;

    @GetMapping("")
    private List<Album> buscarTodos() {
        return this.albumService.buscarTodos();
    }

    @PostMapping("")
    private Album guardar(Album album) {
        System.out.println("album = " + album);
        return this.albumService.guardar(album);
    }

    @PutMapping(value = "")
    // @RequestBody // Indica a spring, que cuando se realizce el post debe realizar el data binding de json al objeto pasado
    private Album actualizar(@RequestBody Album album) {
        System.out.println("album = " + album);
        return this.albumService.guardar(album);
    }
    
    @DeleteMapping("/{id}")
    private Album eliminar(@PathVariable Long id) {
        System.out.println("id = " + id);
        return this.albumService.eliminar(id);
    }

}