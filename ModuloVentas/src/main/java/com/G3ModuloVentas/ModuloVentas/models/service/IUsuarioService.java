package com.G3ModuloVentas.ModuloVentas.models.service;
import java.util.List;

import com.G3ModuloVentas.ModuloVentas.models.entity.Usuario;

public interface IUsuarioService {
public List<Usuario> findAll(); 
	
	public Usuario findById(Integer idusuario);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Integer idusuario);
}
