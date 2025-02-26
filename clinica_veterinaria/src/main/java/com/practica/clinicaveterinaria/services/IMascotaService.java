package com.practica.clinicaveterinaria.services;

import com.practica.clinicaveterinaria.dto.MascotaDTO;
import com.practica.clinicaveterinaria.dto.MascotaDuenioDTO;
import com.practica.clinicaveterinaria.models.Mascota;

import java.util.List;

public interface IMascotaService {

    public abstract void saveMascota(Mascota mascota);

    public abstract List<Mascota> getMascotas();

    public abstract Mascota getById(Long id);

    public abstract void editMascota(Mascota mascota);

    public abstract void deleteMascota(Long id);

    public abstract List<Mascota> getMascotasEsp(Mascota mascota);

    public abstract void saveMascota(MascotaDTO mascotaDTO);

    public abstract List<MascotaDuenioDTO> getMascotasDuenios();
}
