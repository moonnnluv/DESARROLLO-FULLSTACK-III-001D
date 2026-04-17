package com.cancha.cancha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cancha.cancha.entity.Cancha;
import com.cancha.cancha.repository.CanchaRepository;

@Service
public class ServicesImpl implements CanchaServices {

    @Autowired
    private CanchaRepository canchaRepository;

    @Override
    public List<Cancha> listarCanchas() {
        return canchaRepository.findAll();
    }

    @Override
    public Cancha crearCancha(Cancha cancha) {
        return canchaRepository.save(cancha);
    }

    @Override
    public Cancha buscarCancha(Long id) {
        return canchaRepository.findById(id).orElse(null);
    }
}