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

    //Listo
    @Override
    public Persona listarId(int id) {
        return data.findById(id).orElse(null);
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    //Listo
    @Override
    public void borrar(int id) {
        if(data.findById(id).isPresent())
            data.deleteById(id);

        else
            throw new IllegalArgumentException("No existe la persona con el id: "+id);
    }

    //corregir
    @Override
    public Persona actualizar(Persona persona) {
        if(data.findById(persona.getId()).orElse(null) == null)
        {
            throw new IllegalArgumentException("No existe la persona con el id pedido");
        }
        return data.save(persona);
    }
}
