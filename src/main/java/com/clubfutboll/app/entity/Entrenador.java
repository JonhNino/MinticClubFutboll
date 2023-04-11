package com.clubfutboll.app.entity;
import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name ="entrenadores")
public class Entrenador implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String nombre;
	private String apellido;
	private int edad;
	private String nacionalidad;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
