package com.reservas.reservas.controller;

import com.reservas.reservas.entity.Reservas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservasController {

    private List<Reservas> listaReservas = new ArrayList<>();

    @GetMapping
    public List<Reservas> obtenerReservas() {
        return listaReservas;
    }

    @PostMapping
    public Reservas agregarReserva(@RequestBody Reservas nuevaReserva) {
        listaReservas.add(nuevaReserva);
        return nuevaReserva;
    }

    @GetMapping("/cancha/{canchaId}")
    public List<Reservas> obtenerReservasPorCancha(@PathVariable int canchaId) {
        List<Reservas> reservasFiltradas = new ArrayList<>();
        
        for (Reservas reserva : listaReservas) {
            if (reserva.getCanchaId() == canchaId) {
                reservasFiltradas.add(reserva);
            }
        }
        return reservasFiltradas;
    }
}