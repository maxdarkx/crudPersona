package com.sofka.crudperson.repositorio;

import com.sofka.crudperson.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfazRepositorioPersona extends CrudRepository<Persona,Integer> {

}
