package com.clubfutboll.app.entity;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name ="competiciones")
public class Competicion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String nombre;
	private int montoPremio;
	private LocalDate fechainicio;
	private LocalDate fechafin;
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
	public int getMontoPremio() {
		return montoPremio;
	}
	public void setMontoPremio(int montoPremio) {
		this.montoPremio = montoPremio;
	}
	public LocalDate getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}
	public LocalDate getFechafin() {
		return fechafin;
	}
	public void setFechafin(LocalDate fechafin) {
		this.fechafin = fechafin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
