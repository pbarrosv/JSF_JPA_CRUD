package com.crud.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "clientes")
public class cliente {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombres;
	
	@Column
	private String apellidos;
	
	@Column
	private String email;
	
	@Column
	private String telefono;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fregistro;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date facturacion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFregistro() {
		return fregistro;
	}
	public void setFregistro(Date fregistro) {
		this.fregistro = fregistro;
	}
	public Date getFacturacion() {
		return facturacion;
	}
	public void setFacturacion(Date facturacion) {
		this.facturacion = facturacion;
	}
	@Override
	public String toString() {
		return "cliente [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email
				+ ", telefono=" + telefono + ", fregistro=" + fregistro + ", facturacion=" + facturacion + "]";
	}
	
	
}
