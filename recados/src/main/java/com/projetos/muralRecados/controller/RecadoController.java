package com.projetos.muralRecados.controller;

import com.projetos.muralRecados.model.Recado;
import com.projetos.muralRecados.service.RecadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Recados")
public class RecadoController {
    private final RecadoService service;

    public RecadoController(RecadoService service){
        this.service = service;
    }

    @GetMapping
    List<Recado> listar(){
        return service.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Recado cadastrar(@RequestBody Recado recado){
        return service.cadastrar(recado);
    }



}
