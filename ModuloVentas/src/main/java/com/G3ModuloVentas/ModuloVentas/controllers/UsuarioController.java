package com.G3ModuloVentas.ModuloVentas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.G3ModuloVentas.ModuloVentas.models.entity.Usuario;
import com.G3ModuloVentas.ModuloVentas.models.service.IUsuarioService;



@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")

public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		return usuarioService.findAll();
	}
	@GetMapping("/usuarios/{idusuario}")
	public Usuario show(@PathVariable String idusuario){
		return usuarioService.findById(idusuario);
	}
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}	
	@PutMapping("/usuarios/{idusuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario datos,@PathVariable String idusuario) {
		Usuario usuarioActual = usuarioService.findById(idusuario);
		usuarioActual.setIdusuario(datos.getIdusuario());
		usuarioActual.setIdrol(datos.getIdrol());
		usuarioActual.setNombre(datos.getNombre());
		usuarioActual.setTipodocumento(datos.getTipodocumento());
		usuarioActual.setNumdocumento(datos.getNumdocumento());
		usuarioActual.setDireccion(datos.getDireccion());
		usuarioActual.setTelefono(datos.getTelefono());
		usuarioActual.setEmail(datos.getEmail());
		usuarioActual.setPassword(datos.getPassword());
		usuarioActual.setEstado(datos.getEstado());
		return usuarioService.save(usuarioActual);
	}
	@DeleteMapping("/usuarios/{idusuario}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String idusuario) {
		usuarioService.delete(idusuario);
	}	
}
