package com.Pauletta.paulettaApis.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pauletta.paulettaApis.models.Paleta;
import com.Pauletta.paulettaApis.repositories.IPaletaRepository;

@Service
public class PaletaService {

	@Autowired
	IPaletaRepository paletaRepository;
	
	public ArrayList<Paleta> getPaletas(){
		
		return (ArrayList<Paleta>) paletaRepository.findAll();
		
	}
	
	public Paleta getPaletaById(Long id) {
		
		return paletaRepository.findById(id).orElse(null);
		
	}
	
	
	public Paleta getPaletaByName(String name) {
		return paletaRepository.findByName(name);
	}
	
	public Paleta insertPaleta(Paleta paleta) {
		
		return paletaRepository.save(paleta);
		
	}
	
	public Paleta updateById(Paleta request, Long id) {
		
		Paleta paleta = paletaRepository.findById(id).get();
		
		paleta.setName(request.getName());
		paleta.setUrl(request.getUrl());
		paleta.setType(request.getType());
		paleta.setDescrip(request.getDescrip());
		paleta.setPrice(request.getPrice());
		
		return paleta;
		
	}
}
