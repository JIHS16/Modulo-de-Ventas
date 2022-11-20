package com.G3ModuloVentas.ModuloVentas.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.G3ModuloVentas.ModuloVentas.models.dao.IPersonaDao;
import com.G3ModuloVentas.ModuloVentas.models.entity.Persona;

@Service
public class PersonaServicelmpl implements IPersonaService {
	@Autowired
	private IPersonaDao personaDao;
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(String idpersona) {
		// TODO Auto-generated method stub
		return personaDao.findById(idpersona).orElse(null);
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	@Transactional
	public void delete(String idpersona) {
		// TODO Auto-generated method stub
		personaDao.deleteById(idpersona);

	}

}
