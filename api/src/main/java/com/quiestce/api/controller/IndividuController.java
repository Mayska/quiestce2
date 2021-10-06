package com.quiestce.api.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiestce.api.apiservice.IndividuApiService;
import com.quiestce.api.model.Individu;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Log4j2
@RestController
public class IndividuController {

	@Autowired
	private IndividuApiService individuApiService;
	
	@Autowired
	private HttpSession httpSession;
	
	private static final Logger logger = LogManager.getLogger(IndividuController.class);
	
	@GetMapping("/individus")
	public Iterable<Individu> individus() {
		String prenom = httpSession.getAttribute("prenom").toString();
		logger.info("le prenom => " + prenom);
		Iterable<Individu> individus = individuApiService.getIndividus();
		return individus;
	}
	
	@GetMapping("/jouer")
	private Individu choisirUnIndividu() {
		Individu choisirUnIndividu = individuApiService.getChoisirUnIndividu();
		httpSession.setAttribute("prenom", choisirUnIndividu.getPrenom());
		return choisirUnIndividu;
	}
		
}
