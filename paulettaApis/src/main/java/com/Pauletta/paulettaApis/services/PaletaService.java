package com.Pauletta.paulettaApis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Pauletta.paulettaApis.exceptions.PaletaNotFoundException;
import com.Pauletta.paulettaApis.models.Paleta;
import com.Pauletta.paulettaApis.repositories.IPaletaRepository;

@Service
public class PaletaService {

	@Autowired
	IPaletaRepository paletaRepository;
	
	public List<Paleta> getPaletas(){
		
		return paletaRepository.findAll();
		
	}
	
	public ResponseEntity<Paleta> getPaletaById(Long id) {
		
		//return paletaRepository.findById(id).orElse(null);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(paletaRepository.findById(id)
				.orElseThrow(PaletaNotFoundException::new));
		
	}
	
	
	public Optional<Paleta> getPaletaByName(String name) {
		Optional<Paleta> paleta = Optional.ofNullable(Optional.of(paletaRepository.findByName(name)).orElse(null));
		return paleta;
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
		
		return paletaRepository.save(paleta);
		
		
	}
}
