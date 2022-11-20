package com.G3ModuloVentas.ModuloVentas.models.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")

public class Usuario {
	@Id
	@Column(length=5,nullable = false)
	private String idusuario;
	@Column(length=5,nullable = false)
	private String idrol;
	@Column(length=100,nullable = false)
	private String nombre;
	@Column(length=20,nullable = false)
	private String tipodocumento;
	@Column(length=20,nullable = false)
	private String numdocumento;
	@Column(length=70,nullable = false)
	private String direccion;
	@Column(length=20,nullable = false)
	private String telefono;
	@Column(length=50,nullable = false)
	private String email;
	@Column(length=5,nullable = false)
	private String password;
	@Column(length=5,nullable = false)
	private String estado;
	public String getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}
	public String getIdrol() {
		return idrol;
	}
	public void setIdrol(String idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumdocumento() {
		return numdocumento;
	}
	public void setNumdocumento(String numdocumento) {
		this.numdocumento = numdocumento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
