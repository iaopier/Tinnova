package com.tinnova.veiculos.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tinnova.veiculos.Model.VeiculoModel;
import com.tinnova.veiculos.Repository.VeiculoRepository;
import com.tinnova.veiculos.Service.VeiculoService;

public class VeiculoServiceImpl implements VeiculoService{
	
	@Autowired
	VeiculoRepository veiculoRepository;

	@Override
	public List<VeiculoModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
