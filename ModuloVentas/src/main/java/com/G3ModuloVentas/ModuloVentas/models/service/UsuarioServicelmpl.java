package com.G3ModuloVentas.ModuloVentas.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.G3ModuloVentas.ModuloVentas.models.dao.IUsuarioDao;
import com.G3ModuloVentas.ModuloVentas.models.entity.Usuario;

@Service
public class UsuarioServicelmpl implements IUsuarioService {
	@Autowired
	private IUsuarioDao usuarioDao;
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Integer idusuario) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(idusuario).orElse(null);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Integer idusuario) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(idusuario);

	}

}
