package com.crud.h2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Departamento;
import com.crud.h2.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	
	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(Departamento departamento) {
		
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	
	@GetMapping("/departamentos/{codigo_departamento}")
	public Departamento departamentoXID(@PathVariable(name="codigo_departamento") Long codigo_departamento) {
		
		Departamento departamento_xid= new Departamento();
		
		departamento_xid=departamentoServiceImpl.departamentoXID(codigo_departamento);
		
		System.out.println("Departamento XID: "+departamento_xid);
		
		return departamento_xid;
	}
	
	@PutMapping("/departamentos/{codigo_departamento}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo_departamento")Long codigo_departamento,Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServiceImpl.departamentoXID(codigo_departamento);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo_departamento}")
	public void eliminarDepartamento(@PathVariable(name="codigo_departamento")Long codigo_departamento) {
		departamentoServiceImpl.eliminarDepartamento(codigo_departamento);
	}
}
