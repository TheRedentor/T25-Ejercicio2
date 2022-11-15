package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadoDAO;
import com.crud.h2.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String dni) {
		
		return iEmpleadoDAO.findById(dni).get();
	}
	

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		
		iEmpleadoDAO.deleteById(dni);
		
	}
}
