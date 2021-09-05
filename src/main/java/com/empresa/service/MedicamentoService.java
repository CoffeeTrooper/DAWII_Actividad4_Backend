package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public List<Medicamento> listaMedicamento();
	
	public Medicamento registroMedicamento(Medicamento medicamento);
	
	public Optional<Medicamento> buscarPorId(int id);
	
	public List<Medicamento> buscarPorNombre(String nombre);
	
	public List<Medicamento> buscarPorStock(int stock);
}
