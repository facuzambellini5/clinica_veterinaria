package com.practica.clinicaveterinaria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/")
    public String saludo(){
        return "VAMOS LOCO PORFIN PUDE LEVANTAR MI APLICACION LAREPUUUU";
    }
}
