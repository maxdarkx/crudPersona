package com.sofka.crudperson.servicios;

import com.sofka.crudperson.entidades.Persona;
import com.sofka.crudperson.repositorio.InterfazRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosPersona implements InterfasServiciosPersona{

    @Autowired
    private InterfazRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Persona listarId(Integer id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(Integer id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}