package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

	//Se autogenera el find al tener el nombre de un atributo
	public List<Alumno> findByDni(String dni);
	
}
