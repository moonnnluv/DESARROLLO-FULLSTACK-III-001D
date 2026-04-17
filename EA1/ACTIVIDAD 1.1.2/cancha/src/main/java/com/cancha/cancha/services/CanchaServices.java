package com.cancha.cancha.services;

import java.util.List;

import com.cancha.cancha.entity.Cancha;

public interface CanchaServices {

    List<Cancha> listarCanchas();

    Cancha crearCancha(Cancha cancha);

    Cancha buscarCancha(Long id);
}