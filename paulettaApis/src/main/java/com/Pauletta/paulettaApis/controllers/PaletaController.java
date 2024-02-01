package com.Pauletta.paulettaApis.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pauletta.paulettaApis.models.Paleta;
import com.Pauletta.paulettaApis.services.PaletaService;

@RestController
@RequestMapping("/paletas")
public class PaletaController {

	@Autowired
	private PaletaService paletaService;
	
	@GetMapping
	public ArrayList<Paleta> getPaletas(){
		return this.paletaService.getPaletas();
	}
	
	@GetMapping("/paletaById")
	@ResponseBody
	public Paleta getPaletaById(@RequestParam Long id) {
		
		return this.paletaService.getPaletaById(id);
		
	}
	
	/*@GetMapping("/paletaByName")
	@ResponseBody
	public ResponseEntity<Paleta> getByName(@RequestParam String name) {
		
		return this.paletaService.getPaletaByName(name);
		
	}*/
	
	@GetMapping("/paletaByName")
	@ResponseBody
	public Paleta getByName(@RequestParam String name) {
		
		return this.paletaService.getPaletaByName(name);
		
	}
	
}