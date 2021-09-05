package com.empresa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaMedicamento(){
		List<Medicamento> lista = service.listaMedicamento();
		
		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Medicamento> registrarMedicamento(@RequestBody Medicamento med){
		Medicamento salida = service.registroMedicamento(med);
		
		if(salida == null) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(salida);
	}
	
	//Métodos Actividad 2
	
	//1. Consulta de Medicamento por ID
	@GetMapping("/{idParam}")
	@ResponseBody
	public ResponseEntity<Optional<Medicamento>> buscarMedicamentoPorId(@PathVariable("idParam") int id){
		Optional<Medicamento> medicamento = service.buscarPorId(id);
		
		if(medicamento.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		else {
			return ResponseEntity.ok(medicamento);
		}
	}
	
	//2. Consulta de Medicamento por Nombre use LIke
	@GetMapping("/nombre/{nom}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> buscarMedicamentoPorNombre(@PathVariable("nom") String nombre){
		List<Medicamento> medicamento = service.buscarPorNombre(nombre);
		
		if(medicamento.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		else {
			return ResponseEntity.ok(medicamento);
		}
	}
	
	//3. Consulta de Medicamento por Stock
	@GetMapping("/stock/{stock}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> buscarMedicamentoPorStock(@PathVariable("stock") int stock){
		List<Medicamento> medicamento = service.buscarPorStock(stock);
		
		if(medicamento.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		else {
			return ResponseEntity.ok(medicamento);
		}
	}
	
}
