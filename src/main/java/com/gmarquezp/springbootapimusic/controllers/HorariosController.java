package com.gmarquezp.springbootapimusic.controllers;

import com.gmarquezp.springbootapimusic.entities.Horario;
import com.gmarquezp.springbootapimusic.services.IHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/horarios")
public class HorariosController {

    @Autowired
    private IHorarioService horarioService;

    @GetMapping("")
    public List<Horario> buscarTodos() {
        return this.horarioService.buscarTodos();
    }

}
