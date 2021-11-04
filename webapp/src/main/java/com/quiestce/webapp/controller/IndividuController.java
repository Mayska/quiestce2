package com.quiestce.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.quiestce.webapp.model.Individu;
import com.quiestce.webapp.model.Questionnaire;
import com.quiestce.webapp.service.IndividuService;
import com.quiestce.webapp.service.QuestionnaireService;

@Controller
public class IndividuController {

	@Autowired
	private IndividuService individuService;
	
	@Autowired
	private QuestionnaireService questionnaireService;

	@GetMapping("/individus")
	public String getIndividus(Model model) {
		Iterable<Individu> individus = individuService.getIndividus();
		model.addAttribute("individus", individus);
		return "index";

	}
	
	@GetMapping("/jouer")
	public String getJouer(Model model) {
		Iterable<Individu> individus = individuService.getIndividus();
		Individu individuChoisi = individuService.getChoisirUnIndividu();
		Iterable<Questionnaire> questions = questionnaireService.getQuestionnaire();
		model.addAttribute("individus", individus);
		model.addAttribute("individuChoisi", individuChoisi);
		model.addAttribute("questions",questions );
		return "index";
	}
	
	@GetMapping("/questionnaire")
	public String getQuestionnaire(Model model) {
		Iterable<Questionnaire> questions = questionnaireService.getQuestionnaire();
		model.addAttribute("questions",questions );
		return "index";
	}
		
}
