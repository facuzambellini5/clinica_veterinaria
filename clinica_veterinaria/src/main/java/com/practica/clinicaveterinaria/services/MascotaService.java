package com.practica.clinicaveterinaria.services;

import com.practica.clinicaveterinaria.dto.MascotaDTO;
import com.practica.clinicaveterinaria.dto.MascotaDuenioDTO;
import com.practica.clinicaveterinaria.models.Duenio;
import com.practica.clinicaveterinaria.models.Mascota;
import com.practica.clinicaveterinaria.repositories.IDuenioRepository;
import com.practica.clinicaveterinaria.repositories.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository mascotaRepo;

    @Autowired
    IDuenioRepository duenioRepo;

    @Override
    public void saveMascota(Mascota mascota){
        mascotaRepo.save(mascota);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public Mascota getById(Long id) {
        return mascotaRepo.findById(id).orElse(null);
    }

    @Override
    public void editMascota(Mascota mascota) {
        Mascota mascota1 = this.getById(mascota.getId_mascota());

        mascota1.setNombre(mascota.getNombre());
        mascota1.setEspecie(mascota.getEspecie());
        mascota1.setRaza(mascota.getRaza());
        mascota1.setColor(mascota.getColor());

        this.saveMascota(mascota1);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepo.deleteById(id);
    }

    @Override
    public List<Mascota> getMascotasEsp(Mascota mascota) {
        List<Mascota> mascotasList = this.getMascotas();
        List<Mascota> mascotasListEsp = new ArrayList<>();

        for(Mascota mascota1 : mascotasList){
            if(mascota1.getEspecie().equals(mascota.getEspecie()) && mascota1.getRaza().equals(mascota.getRaza())){
                mascotasListEsp.add(mascota1);
            }
        }
        return mascotasListEsp;
    }
    @Override
    public void saveMascota(MascotaDTO mascotaDTO) {

        Duenio duenio = duenioRepo.findById(mascotaDTO.getId_duenio()).orElse(null);
        Mascota mascota = new Mascota();

        mascota.setNombre(mascotaDTO.getNombre());
        mascota.setEspecie(mascotaDTO.getEspecie());
        mascota.setRaza(mascotaDTO.getRaza());
        mascota.setColor(mascotaDTO.getColor());
        mascota.setDuenio(duenio);

        duenio.getListaMascotas().add(mascota);

        mascotaRepo.save(mascota);
        duenioRepo.save(duenio);
    }

    @Override
    public List<MascotaDuenioDTO> getMascotasDuenios() {

        List<MascotaDuenioDTO> listaMascotaDuenioDTO = new ArrayList<>();
        List<Mascota> listaMascotas = this.getMascotas();

        for(Mascota mascota : listaMascotas){
            MascotaDuenioDTO mascotaDuenioDTO = new MascotaDuenioDTO();

            mascotaDuenioDTO.setNombre_mascota(mascota.getNombre());
            mascotaDuenioDTO.setEspecie(mascota.getEspecie());
            mascotaDuenioDTO.setRaza(mascota.getRaza());
            mascotaDuenioDTO.setNombre_duenio(mascota.getDuenio().getNombre());
            mascotaDuenioDTO.setApellido_duenio(mascota.getDuenio().getApellido());

            listaMascotaDuenioDTO.add(mascotaDuenioDTO);
        }
        return  listaMascotaDuenioDTO;
    }
}
