package com.practica.clinicaveterinaria.services;

import com.practica.clinicaveterinaria.models.Duenio;
import com.practica.clinicaveterinaria.repositories.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    IDuenioRepository duenioRepo;

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public List<Duenio> getDuenios() {
        return duenioRepo.findAll();
    }

    @Override
    public Duenio getById(Long id) {
        return duenioRepo.findById(id).orElse(null);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepo.deleteById(id);
    }
}
