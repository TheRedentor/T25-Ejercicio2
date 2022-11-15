package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="empleados")
public class Empleado {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "dni")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	
	@ManyToOne
    @JoinColumn(name="codigo_departamento")
    private Departamento departamento;
	
	public Empleado() {
		
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param codigo_departamento
	 */
	public Empleado(String dni, String nombre, String apellidos, Departamento departamento) {
		//super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	
	//Getters y Setters
	
	/**
	 * @return dni
	 */
	public String dni() {
		return dni;
	}

	/**
	 * @param dni
	 */
	public void setId(String dni) {
		this.dni = dni;
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
	 * @return apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * @return departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento=" + departamento + "]";
	}
}
