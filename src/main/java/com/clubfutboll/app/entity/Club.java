package com.clubfutboll.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name ="clubes")
public class Club implements Serializable{
		private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@OneToOne(fetch =FetchType.EAGER)
//	@JoinColumn(nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Entrenador entrenador;
	@OneToMany(fetch =FetchType.LAZY)
	@JoinColumn(name ="id_club")
	private List<Jugador>jugadores;	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name ="id_asociacion")
	private Asociacion asociacion;
	@ManyToMany(fetch =FetchType.LAZY)
	private List<Competicion>competiciones;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Asociacion getAsociacion() {
		return asociacion;
	}
	public void setAsociacion(Asociacion asociacion) {
		this.asociacion = asociacion;
	}
	

}
