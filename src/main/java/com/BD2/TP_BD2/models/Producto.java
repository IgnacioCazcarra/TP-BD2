package com.BD2.TP_BD2.models;

public class Producto {

	private int codigoNumerico;
	private String descripcion;
	private String laboratorio;
	private float precio;
	private String tipoDeProducto;

	public Producto() {
		super();
	}

	public Producto(int codigoNumerico, String descripcion, String laboratorio, float precio, String tipoDeProducto) {
		super();
		this.codigoNumerico = codigoNumerico;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.precio = precio;
		this.tipoDeProducto = tipoDeProducto;
	}

	public int getCodigoNumerico() {
		return codigoNumerico;
	}

	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTipoDeProducto() {
		return tipoDeProducto;
	}

	public void setTipoDeProducto(String tipoDeProducto) {
		this.tipoDeProducto = tipoDeProducto;
	}

	@Override
	public String toString() {
		return "Producto [codigoNumerico=" + codigoNumerico + ", descripcion=" + descripcion + ", laboratorio="
				+ laboratorio + ", precio=" + precio + ", tipoDeProducto=" + tipoDeProducto + "]";
	}

}
