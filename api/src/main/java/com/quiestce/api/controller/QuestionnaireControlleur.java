package com.quiestce.api.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiestce.api.model.Questionnaire;
import com.quiestce.api.service.QuestionnaireService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class QuestionnaireControlleur {
	
	private static final Logger logger = LogManager.getLogger(QuestionnaireControlleur.class);
	
	@Autowired
	private QuestionnaireService questionnaireService;
	
	@GetMapping("/questionnaire")
	private ResponseEntity<Iterable<Questionnaire>> getQuestionnaire() {
		logger.info("Récupération du questionnaire");
		return ResponseEntity.ok(questionnaireService.getQuestions());
	}
		
	
}
