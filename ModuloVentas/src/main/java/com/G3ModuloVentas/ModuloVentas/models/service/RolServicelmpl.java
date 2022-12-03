package com.G3ModuloVentas.ModuloVentas.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.G3ModuloVentas.ModuloVentas.models.dao.IRolDao;
import com.G3ModuloVentas.ModuloVentas.models.entity.Rol;


@Service
public class RolServicelmpl implements IRolService {

	@Autowired
	private IRolDao rolDao;
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return (List<Rol>) rolDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Rol findById(Integer idrol) {
		// TODO Auto-generated method stub
		return rolDao.findById(idrol).orElse(null);
	}

	@Override
	@Transactional
	public Rol save(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.save(rol);
	}

	@Override
	@Transactional
	public void delete(Integer idrol) {
		// TODO Auto-generated method stub
		rolDao.deleteById(idrol);

	}

}