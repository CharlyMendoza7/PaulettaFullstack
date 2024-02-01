package com.Pauletta.paulettaApis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pauletta.paulettaApis.models.Paleta;

@Repository
public interface IPaletaRepository extends JpaRepository<Paleta, Long>{

	Paleta findByName(String name);
	
}
