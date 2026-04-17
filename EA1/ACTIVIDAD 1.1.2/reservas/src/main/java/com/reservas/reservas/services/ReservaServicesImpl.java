package com.reservas.reservas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.reservas.reservas.entity.Reserva;
import com.reservas.reservas.entity.dto.Cancha;
import com.reservas.reservas.repository.ReservaRepository;
import java.util.List;

@Service
public class ReservaServicesImpl implements ReservaServices {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva crearReserva(Reserva reserva) {
        String url = "http://localhost:8081/api/canchas/" + reserva.getCanchaId();
        Cancha cancha = restTemplate.getForObject(url, Cancha.class);

        if (cancha == null) {
            throw new RuntimeException("La cancha no existe");
        }

        return reservaRepository.save(reserva);
    }

    @Override
    public List<Reserva> buscarReservasPorCancha(Long canchaId) {
        return reservaRepository.findByCanchaId(canchaId);
    }
}