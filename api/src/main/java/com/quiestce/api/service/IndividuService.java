package com.quiestce.api.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

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

	public Individu getChoisirUnIndividu(Iterable<Individu> individus) {
		int max = 0;
		int min = 0;
		if (individus instanceof Collection) {
			max = ((Collection<?>) individus).size();
		}
		List<Individu> individu = new ArrayList<Individu>();
		individus.forEach(individu::add);
		int nombreAleatoire = (int) (Math.random() * (max - min));
		return individu.get(nombreAleatoire);
	}
	
	public Iterable<Individu> getTousLesIndividus() {
		return individuRepository.findAll();
	}
}
