package com.BD2.TP_BD2.models;

public class Localidad {

	private int idLocalidad;
	private String nombre;

	public Localidad() {
		super();
	}

	public Localidad(int idLocalidad, String nombre) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
	}

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", nombre=" + nombre + "]";
	}

}
