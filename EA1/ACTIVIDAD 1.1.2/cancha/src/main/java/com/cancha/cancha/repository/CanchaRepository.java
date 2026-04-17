package com.cancha.cancha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cancha.cancha.entity.Cancha;

public interface CanchaRepository extends JpaRepository<Cancha, Long> {
}