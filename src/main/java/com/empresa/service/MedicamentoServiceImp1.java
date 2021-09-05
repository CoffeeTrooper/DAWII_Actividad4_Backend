package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImp1 implements MedicamentoService{

	@Autowired
	MedicamentoRepository repository;

	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Medicamento registroMedicamento(Medicamento medicamento) {
		// TODO Auto-generated method stub
		return repository.save(medicamento);
	}

	@Override
	public Optional<Medicamento> buscarPorId(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Medicamento> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombreLike(nombre);
	}

	@Override
	public List<Medicamento> buscarPorStock(int stock) {
		// TODO Auto-generated method stub
		return repository.findByStock(stock);
	}
	
}
