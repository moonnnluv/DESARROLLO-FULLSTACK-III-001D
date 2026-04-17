package com.reservas.reservas.services;

import java.util.List;
import com.reservas.reservas.entity.Reserva;

public interface ReservaServices {

    List<Reserva> listarReservas();

    Reserva crearReserva(Reserva reserva);

    List<Reserva> buscarReservasPorCancha(Long canchaId);
}