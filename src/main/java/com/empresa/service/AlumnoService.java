package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaAlumno();
	public abstract Alumno insertaActualizaAlumno(Alumno obj);
	
	//El optional permite preguntar si el obj que se retorna es nulo
	public abstract Optional<Alumno> buscarPorId(int idAlumno);

	public abstract void eliminarPorId(int idAlumno);
	
	
	public abstract List<Alumno> consultaPorDni(String dni);
}
