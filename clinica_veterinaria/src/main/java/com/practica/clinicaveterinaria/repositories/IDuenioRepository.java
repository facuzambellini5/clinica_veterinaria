package com.practica.clinicaveterinaria.repositories;

import com.practica.clinicaveterinaria.models.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
}
