package com.gmarquezp.springbootapimusic.repositories;

import com.gmarquezp.springbootapimusic.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorariosRepository extends JpaRepository<Horario, Long> {
}
