package com.G3ModuloVentas.ModuloVentas.models.service;

import java.util.List;

import com.G3ModuloVentas.ModuloVentas.models.entity.Rol;



public interface IRolService {
public List<Rol> findAll(); 
	
	public Rol findById(Integer idrol);
	
	public Rol save(Rol rol);
	
	public void delete(Integer idrol);

}
