package com.cancha.cancha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cancha.cancha.entity.Cancha;
import com.cancha.cancha.services.CanchaServices;

@RestController
@RequestMapping("/api/canchas")
public class CanchaController {

    @Autowired
    private CanchaServices canchaService;

    @GetMapping
    public List<Cancha> listarCanchas() {
        return canchaService.listarCanchas();
    }

    @PostMapping
    public Cancha crearCancha(@RequestBody Cancha cancha) {
        return canchaService.crearCancha(cancha);
    }

    @GetMapping("/{id}")
    public Cancha buscarCancha(@PathVariable Long id) {
        return canchaService.buscarCancha(id);
    }
}