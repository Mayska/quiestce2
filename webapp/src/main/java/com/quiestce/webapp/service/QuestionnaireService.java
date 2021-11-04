package com.quiestce.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiestce.webapp.model.Individu;
import com.quiestce.webapp.model.Questionnaire;
import com.quiestce.webapp.repository.QuestionnaireProxy;

import lombok.Data;

@Data
@Service
public class QuestionnaireService {
	
	@Autowired
	private QuestionnaireProxy questionnaireProxy;

	public Iterable<Questionnaire> getQuestionnaire() {
		return questionnaireProxy.getQuestionnaire();
	}
	
}
