package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartamentoDAO;
import com.crud.h2.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Long codigo_departamento) {
		
		return iDepartamentoDAO.findById(codigo_departamento).get();
	}
	

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long codigo_departamento) {
		
		iDepartamentoDAO.deleteById(codigo_departamento);
		
	}
}
