package com.tinnova.veiculos.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinnova.veiculos.Model.VeiculoModel;
import com.tinnova.veiculos.Repository.VeiculoRepository;


@RestController
public class VeiculoController {

	@Autowired
	VeiculoRepository veiculoRepository;
	
	@GetMapping("/veiculos")
	public ResponseEntity<?> veiculosFindAll() {
		return new ResponseEntity<>(veiculoRepository.findAll(), HttpStatus.OK);
	}
	
	//DOESN'T WORK
	@GetMapping("/veiculos/find/{q}")
	public ResponseEntity<?> veiculosFindParam( @PathVariable(value="q") String q ) {
		return new ResponseEntity<>(veiculoRepository.findParam(q), HttpStatus.OK)  ;
	}
	
	@GetMapping("/veiculos/{id}")
	public ResponseEntity<?> veiculosFindId(@PathVariable(value="id") long id ) {
		return new ResponseEntity<>(veiculoRepository.findById(id), HttpStatus.OK)  ;
	}
	
	@PostMapping("/veiculos")
	public ResponseEntity<?> saveVeiculo(@RequestBody @Validated VeiculoModel veiculo) {
		return new ResponseEntity<>(veiculoRepository.save(veiculo), HttpStatus.CREATED);
	}
	
	@PutMapping("/veiculos/{id}")
	public ResponseEntity<?> updateVeiculo(@RequestBody @Validated VeiculoModel veiculo,@PathVariable(value="id") long id) {
		Optional<VeiculoModel> veiculoO = veiculoRepository.findById(id);
		if(!veiculoO.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			veiculo.setId(veiculoO.get().getId());
			return new ResponseEntity<>(veiculoRepository.save(veiculo), HttpStatus.OK);
		}
	}
	
	
	
}
