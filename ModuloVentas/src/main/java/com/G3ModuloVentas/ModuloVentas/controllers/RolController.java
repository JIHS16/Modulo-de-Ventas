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


import com.G3ModuloVentas.ModuloVentas.models.entity.Rol;
import com.G3ModuloVentas.ModuloVentas.models.service.IRolService;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")

public class RolController {
	
	@Autowired
	private IRolService rolService;
	@GetMapping("/roles")
	public List<Rol> index(){
		return rolService.findAll();
	}
	@GetMapping("/roles/{idrol}")
	public Rol show(@PathVariable Integer idrol){
		return rolService.findById(idrol);
	}
	@PostMapping("/roles")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol create(@RequestBody Rol rol) {
		return rolService.save(rol);
	}	
	@PutMapping("/roles/{idrol}")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol update(@RequestBody Rol datos,@PathVariable Integer idrol) {
		Rol rolActual = rolService.findById(idrol);
		rolActual.setNombre(datos.getNombre());
		rolActual.setDescripcion(datos.getDescripcion());
		rolActual.setEstado(datos.getEstado());
		
		
		return rolService.save(rolActual);
	}
	@DeleteMapping("/roles/{idrol}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer idrol) {
		rolService.delete(idrol);
	}	

}
