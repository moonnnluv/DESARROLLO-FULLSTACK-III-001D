package com.reservas.reservas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.reservas.reservas.entity.Reserva;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
    List<Reserva> findByCanchaId(Long canchaId);
}