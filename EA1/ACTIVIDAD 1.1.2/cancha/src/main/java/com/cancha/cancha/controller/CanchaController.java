package com.cancha.cancha.controller;

import com.cancha.cancha.entity.Cancha;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/canchas")
public class CanchaController {

    private List<Cancha> listaCanchas = new ArrayList<>();

    @GetMapping
    public List<Cancha> obtenerCanchas() {
        return listaCanchas;
    }

    @PostMapping
    public Cancha agregarCancha(@RequestBody Cancha nuevaCancha) {
        listaCanchas.add(nuevaCancha);
        return nuevaCancha; 
    }
}