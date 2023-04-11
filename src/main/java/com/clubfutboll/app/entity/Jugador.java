package com.clubfutboll.app.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name ="jugadores")
public class Jugador implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String nombre;
	private String apellido;
	private int numero;
	private String posicion;
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
