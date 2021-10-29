package com.quiestce.api.apiservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.quiestce.api.model.Individu;
import com.quiestce.api.repository.IndividuRepository;
import com.quiestce.api.service.IndividuService;
import com.quiestce.api.service.SessionService;

@Service
public class IndividuApiService {
	
	@Autowired
	private IndividuRepository individuRepository;
	
	@Autowired
	private IndividuService individuService;
	
	public Iterable<Individu> getIndividus() {
		Optional<Iterable<Individu>> optionalIndividus = Optional.ofNullable(individuRepository.findAll());
		checkIndividu(optionalIndividus);
		return individuService.getIndividus(optionalIndividus.get());
	}

	private void checkIndividu(Optional<Iterable<Individu>> optionalIndividus) {
		if(!optionalIndividus.isPresent()) {
			String msg = "[Erreur] lors de la récupération des données Individus.";
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND, msg);
		};
	}

	public Individu getChoisirUnIndividu() {
		Iterable<Individu> individus = getIndividus();
		return individuService.getChoisirUnIndividu(individus);
	}
}
