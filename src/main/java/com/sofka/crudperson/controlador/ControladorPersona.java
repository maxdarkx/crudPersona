package com.sofka.crudperson.controlador;

import com.sofka.crudperson.entidades.Persona;
import com.sofka.crudperson.servicios.InterfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {
    @Autowired
    private InterfasServiciosPersona servicio;

    @GetMapping(value="/listarPersonas")
    public Iterable<Persona> listarPersonas()
    {
        return servicio.listar();
    }

    @GetMapping(value = "/listarPersona/{id}")
    public Persona listarPersonaId(@PathVariable Integer id)
    {
        return servicio.listarId(id);
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona)
    {
        return servicio.guardar(persona);
    }

    @DeleteMapping(value = "/borrarPersona/{id}")
    public void borrarPersona(@PathVariable Integer id)
    {
        servicio.borrar(id);
    }
}
