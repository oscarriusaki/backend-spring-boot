package com.api.prueba.repository;

import com.api.prueba.model.Vehiculos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculos, Long> {
}
