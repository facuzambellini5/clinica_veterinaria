package com.practica.clinicaveterinaria.controllers;

import com.practica.clinicaveterinaria.dto.MascotaDTO;
import com.practica.clinicaveterinaria.dto.MascotaDuenioDTO;
import com.practica.clinicaveterinaria.models.Mascota;
import com.practica.clinicaveterinaria.services.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

    @Autowired
    IMascotaService mascotaServ;


    @PostMapping("/save")
    public String saveMascota(@RequestBody MascotaDTO mascotaDTO){
        mascotaServ.saveMascota(mascotaDTO);
        return "Mascota guardada correctamente.";
    }

    @GetMapping("/traer")
    public List<Mascota> getMascotas(){
        return mascotaServ.getMascotas();
    }

    @GetMapping("/traer/{id}")
    public Mascota getById(@PathVariable Long id){
        return mascotaServ.getById(id);
    }

    @PutMapping("/edit")
    public String editMascota(@RequestBody Mascota mascota){
        mascotaServ.editMascota(mascota);
        return "Mascota editada correctamente.";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        if(mascotaServ.getById(id) != null){
            mascotaServ.deleteMascota(id);
            return "Mascota eliminada correctamente.";
        }else{
            return "No se ha encontrado la mascota.";
        }
    }

    @PostMapping("/traer")
    public List<Mascota> getMascotasEsp(@RequestBody Mascota mascota){
        return mascotaServ.getMascotasEsp(mascota);
    }

    @GetMapping("/traer/dueño")
    public List<MascotaDuenioDTO> getMascotasDuenios(){
        return mascotaServ.getMascotasDuenios();
    }
}

