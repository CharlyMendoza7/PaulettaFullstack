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
	
	/*public ResponseEntity<Paleta> getPaletaByName(String name) {
		
		return new ResponseEntity<Paleta>(paletaRepository.findByName(name), HttpStatus.OK);
		
	}*/
	
	public Paleta getPaletaByName(String name) {
		return paletaRepository.findByName(name);
	}
	
}
