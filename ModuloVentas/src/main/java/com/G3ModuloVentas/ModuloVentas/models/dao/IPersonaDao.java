package com.G3ModuloVentas.ModuloVentas.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.G3ModuloVentas.ModuloVentas.models.entity.Persona;

@Repository
public interface IPersonaDao extends CrudRepository<Persona,String> {

}
