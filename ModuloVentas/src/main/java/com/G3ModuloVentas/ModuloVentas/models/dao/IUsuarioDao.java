package com.G3ModuloVentas.ModuloVentas.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.G3ModuloVentas.ModuloVentas.models.entity.Usuario;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario,String>{

}
