package com.practica.clinicaveterinaria.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_duenio;
    private int dni;
    private String nombre;
    private String apellido;
    private String celular;

    @OneToMany(mappedBy = "duenio")
    private List<Mascota> listaMascotas;

    public Duenio() {
    }

    public Duenio(Long id_duenio, int dni, String nombre, String apellido, String celular, List<Mascota> listaMascotas) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.listaMascotas = listaMascotas;
    }

    public Long getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(Long id_duenio) {
        this.id_duenio = id_duenio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }


}
