package com.quiestce.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiestce.api.model.Questionnaire;
import com.quiestce.api.repository.QuestionnaireRepository;

@Service
public class QuestionnaireService {
	
	@Autowired
	private QuestionnaireRepository questionnaireRepository;
		
	/**
	 * Récupére toutes les questions.
	 * @return
	 */
	public Iterable<Questionnaire> getQuestions() {
		return questionnaireRepository.findAll();
	}

}
