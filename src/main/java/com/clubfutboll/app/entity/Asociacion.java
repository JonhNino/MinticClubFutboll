package com.clubfutboll.app.entity;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name ="asociaciones")
public class Asociacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String nombre;
	private String pais;
	private String presidente;
	
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 

}
