package com.G3ModuloVentas.ModuloVentas.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Roles")
public class Rol {

	@Id
	@Column(length=5,nullable = false)
	private Integer idrol;
	@Column(length=30,nullable = false)
	private String nombre;
	@Column(length=100,nullable = false)
	private String descripcion;
	@Column(length=20,nullable = false)
	private String estado;
	public Integer getIdrol() {
		return idrol;
	}
	public void setIdrol(Integer idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}