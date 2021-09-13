package com.sofka.crudperson.servicios;

import com.sofka.crudperson.entidades.Persona;

import java.util.List;

public interface InterfasServiciosPersona {
    List<Persona> listar();
    Persona listarId(int id);
    Persona guardar(Persona persona);
    void borrar(int id);
    Persona actualizar(Persona persona);
}
