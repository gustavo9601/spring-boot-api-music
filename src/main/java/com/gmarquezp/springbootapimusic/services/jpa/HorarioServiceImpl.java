package com.gmarquezp.springbootapimusic.services.jpa;

import com.gmarquezp.springbootapimusic.entities.Album;
import com.gmarquezp.springbootapimusic.entities.Horario;
import com.gmarquezp.springbootapimusic.repositories.HorariosRepository;
import com.gmarquezp.springbootapimusic.services.IHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioServiceImpl implements IHorarioService {

    @Autowired
    private HorariosRepository horariosRepository;

    @Override
    public List<Horario> buscarTodos() {
        return this.horariosRepository.findAll();
    }
}
