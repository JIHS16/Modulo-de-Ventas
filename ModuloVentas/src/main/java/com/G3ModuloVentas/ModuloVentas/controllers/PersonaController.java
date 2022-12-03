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

import com.G3ModuloVentas.ModuloVentas.models.entity.Persona;
import com.G3ModuloVentas.ModuloVentas.models.service.IPersonaService;


@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")

public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	@GetMapping("/personas")
	public List<Persona> index(){
		return personaService.findAll();
	}
	@GetMapping("/personas/{idpersona}")
	public Persona show(@PathVariable Integer idpersona){
		return personaService.findById(idpersona);
	}
	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return personaService.save(persona);
	}	
	@PutMapping("/personas/{idpersona}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@RequestBody Persona datos,@PathVariable Integer idpersona) {
		Persona personaActual = personaService.findById(idpersona);
		personaActual.setTipopersona(datos.getTipopersona());
		personaActual.setNombre(datos.getNombre());
		personaActual.setTipodocumento(datos.getTipodocumento());
		personaActual.setNumdocumento(datos.getNumdocumento());
		personaActual.setDireccion(datos.getDireccion());
		personaActual.setTelefono(datos.getTelefono());
		personaActual.setEmail(datos.getEmail());
		return personaService.save(personaActual);
	}
	@DeleteMapping("/personas/{idpersona}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer idpersona) {
		personaService.delete(idpersona);
	}	

}
