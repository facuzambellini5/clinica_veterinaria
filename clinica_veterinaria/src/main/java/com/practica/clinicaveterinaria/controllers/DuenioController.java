package com.practica.clinicaveterinaria.controllers;

import com.practica.clinicaveterinaria.models.Duenio;
import com.practica.clinicaveterinaria.services.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dueño")
public class DuenioController {

    @Autowired
    IDuenioService duenioServ;

    @PostMapping("/save")
    public String saveDuenio(@RequestBody Duenio duenio) {
        duenioServ.saveDuenio(duenio);
        return "Dueño guardado correctamente";
    }

    @GetMapping("/traer")
    public List<Duenio> getDuenios(){
        return duenioServ.getDuenios();
    }

    @GetMapping("/traer/{id}")
    public Duenio getById(@PathVariable Long id){
        return duenioServ.getById(id);
    }

    //Pasar Id existente, de lo contrario creará otro objeto.
    @PutMapping("/edit")
    public String editDuenio(@RequestBody Duenio duenio){
        duenioServ.editDuenio(duenio);
        return "Se ha editado correctamente.";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        if(duenioServ.getById(id) != null){
            duenioServ.deleteDuenio(id);
            return "Dueño eliminado correctamente.";
        }else{
            return "No se ha encontrado el dueño.";
        }
    }


}
