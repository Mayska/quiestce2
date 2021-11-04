package com.quiestce.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiestce.api.model.Individu;
import com.quiestce.api.repository.IndividuRepository;

@Service
public class IndividuService {
	
	@Autowired
	private IndividuRepository individuRepository;
	
	public Iterable<Individu> getIndividus(Iterable<Individu> iterable) {
		return iterable;
	}

	/**
	 * Je me suis bien compliqué la vie!!
	 * Combien il y a des personnages, random un chiggre et JUSTE un findByid!!! 
	 * @param individus
	 * @return
	 */
	public Individu getChoisirUnIndividu() {
		int max = (int) individuRepository.count();
		int min = 0;
		int nombreAleatoire = (int) (Math.random() * (max - min));
		return individuRepository.findById((long) nombreAleatoire).get();
	}
	
	public Iterable<Individu> getTousLesIndividus() {
		return individuRepository.findAll();
	}
}
