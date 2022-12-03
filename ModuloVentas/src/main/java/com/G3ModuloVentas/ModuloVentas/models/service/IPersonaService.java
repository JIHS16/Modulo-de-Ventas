package com.G3ModuloVentas.ModuloVentas.models.service;

import java.util.List;

import com.G3ModuloVentas.ModuloVentas.models.entity.Persona;


public interface IPersonaService {
public List<Persona> findAll(); 
	
	public Persona findById(Integer idpersona);
	
	public Persona save(Persona persona);
	
	public void delete(Integer idpersona);
}