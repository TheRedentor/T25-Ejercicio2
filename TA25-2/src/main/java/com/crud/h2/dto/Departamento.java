package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_departamento;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "presupuesto")
	private int presupuesto;
	
	@OneToMany
    @JoinColumn(name="codigo_departamento")
    private List<Empleado> empleado;
	
	public Departamento() {
		
	}

	/**
	 * @param codigo_departamento
	 * @param nombre
	 * @param presupuesto
	 */
	public Departamento(Long codigo_departamento, String nombre, int presupuesto) {
		//super();
		this.codigo_departamento = codigo_departamento;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_departamento
	 */
	public Long getId() {
		return codigo_departamento;
	}

	/**
	 * @param codigo_departamento
	 */
	public void setId(Long codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return presupuesto
	 */
	public int getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto
	 */
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Departamento [codigo_departamento=" + codigo_departamento + ", nombre=" + nombre + ", presupuesto=" + presupuesto + "]";
	}
}
