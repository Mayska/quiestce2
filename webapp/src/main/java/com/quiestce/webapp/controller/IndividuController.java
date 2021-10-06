package com.quiestce.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.quiestce.webapp.model.Individu;
import com.quiestce.webapp.service.IndividuService;

@Controller
public class IndividuController {

	@Autowired
	private IndividuService individuService;
	

	@GetMapping("/individus")
	public String getIndividus(Model model) {
		Iterable<Individu> individus = individuService.getIndividus();
		model.addAttribute("individus", individus);
		return "index";

	}
	
	@GetMapping("/jouer")
	public String getJouer(Model model) {
		Individu individuChoisi = individuService.getChoisirUnIndividu();
		model.addAttribute("individuChoisi", individuChoisi);
		return "index";
	}

}
