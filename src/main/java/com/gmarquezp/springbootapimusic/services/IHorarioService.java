package com.gmarquezp.springbootapimusic.services;

import com.gmarquezp.springbootapimusic.entities.Horario;

import java.util.List;

public interface IHorarioService {
    List<Horario> buscarTodos();
}
