package com.practica.clinicaveterinaria.dto;

public class MascotaDTO {
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    private Long id_duenio;

    public MascotaDTO() {
    }

    public MascotaDTO(String nombre, String especie, String raza, String color, Long id_duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(Long id_duenio) {
        this.id_duenio = id_duenio;
    }
}
