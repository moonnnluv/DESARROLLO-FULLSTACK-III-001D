package com.reservas.reservas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.reservas.reservas.entity.Reserva;
import com.reservas.reservas.services.ReservaServices;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaServices reservaService;

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.listarReservas();
    }

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.crearReserva(reserva);
    }

    @GetMapping("/cancha/{id}")
    public List<Reserva> buscarPorCancha(@PathVariable Long id) {
        return reservaService.buscarReservasPorCancha(id);
    }
}