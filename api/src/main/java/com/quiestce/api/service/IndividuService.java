package com.quiestce.api.service;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiestce.api.controller.IndividuController;
import com.quiestce.api.model.Individu;
import com.quiestce.api.repository.IndividuRepository;

@Service
public class IndividuService {
	
	@Autowired
	private IndividuRepository individuRepository;
	
	private static final Logger logger = LogManager.getLogger(IndividuService.class);
	
	public Iterable<Individu> getIndividus(Iterable<Individu> iterable) {
		return iterable;
	}

	/**
	 *
	 * @param individus
	 * @return
	 */
	//TO DO
	public Individu getChoisirUnIndividu() {
		int nombreAleatoire = nombreAleatoire();
		logger.info("Contenu du nombreAleatoire =>" + nombreAleatoire);
		Optional<Individu> findById = individuRepository.findById((long) nombreAleatoire);
		// Normalement c'est impossible
		if(!findById.isPresent()) {
			findById = individuRepository.findById(1L);
		}
		return findById.get();
	}

	private int nombreAleatoire() {
		int max = (int) individuRepository.count();
		int min = 1;
		int nombreAleatoire = (int) (Math.random() * (max - min) + 1);
		if(nombreAleatoire == 0) {
			nombreAleatoire = 1;
		}
		return nombreAleatoire;
	}
	
	
	
	public Iterable<Individu> getTousLesIndividus() {
		return individuRepository.findAll();
	}
}
