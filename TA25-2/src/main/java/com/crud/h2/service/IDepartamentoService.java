package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Departamento;

public interface IDepartamentoService {
	
	public List<Departamento> listarDepartamentos();
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public Departamento departamentoXID(Long codigo_departamento);
	
	public Departamento actualizarDepartamento(Departamento departamento);
	
	public void eliminarDepartamento(Long codigo_departamento);
	
}
