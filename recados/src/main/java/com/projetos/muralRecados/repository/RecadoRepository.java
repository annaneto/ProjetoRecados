package com.projetos.muralRecados.repository;

import com.projetos.muralRecados.model.Recado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public class RecadoRepository extends JpaRepository<Recado, Long> {

    boolean existsById(Long id);

    List<Recado> findByAutor(Recado autor);

    List<Recado> findById(Recado id);

    }

}
