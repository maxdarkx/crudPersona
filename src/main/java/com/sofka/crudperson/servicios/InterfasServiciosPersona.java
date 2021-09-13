package com.sofka.crudperson.servicios;

import com.sofka.crudperson.entidades.Persona;

import java.util.List;

public interface InterfasServiciosPersona {
    List<Persona> listar();
    Persona listarId(Integer id);
    Persona guardar(Persona persona);
    void borrar(Integer id);
    Persona actualizar(Persona persona);
}
