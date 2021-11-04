package com.quiestce.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiestce.api.apiservice.IndividuApiService;
import com.quiestce.api.model.Individu;
import com.quiestce.api.service.SessionService;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Log4j2
@RestController
public class IndividuController {

	@Autowired
	private IndividuApiService individuApiService;
	
	@Autowired
	private SessionService sessionService;
	
	private static final Logger logger = LogManager.getLogger(IndividuController.class);
	
	@GetMapping("/individus")
	public ResponseEntity<Iterable<Individu>> getIndividus() {
		sessionService.individuChoisi();
		String prenomChoisi = sessionService.getPrenomChoisi();
		if(prenomChoisi != null) {
			logger.info("Prénom => " + prenomChoisi);
		}
		Iterable<Individu> individus = individuApiService.getIndividus();
		return ResponseEntity.ok(individus);
	}
	
	@GetMapping("/jouer")
	private Individu choisirUnIndividu() {
		return sessionService.individuChoisi();
	}
		
}
