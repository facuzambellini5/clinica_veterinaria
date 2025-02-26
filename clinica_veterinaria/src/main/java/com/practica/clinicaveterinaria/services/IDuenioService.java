package com.practica.clinicaveterinaria.services;

import com.practica.clinicaveterinaria.models.Duenio;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDuenioService {


    public abstract void saveDuenio(Duenio duenio);

    public abstract List<Duenio> getDuenios();

    public abstract Duenio getById(Long id);

    public abstract void editDuenio(Duenio duenio);

    public abstract void deleteDuenio(Long id);
}
