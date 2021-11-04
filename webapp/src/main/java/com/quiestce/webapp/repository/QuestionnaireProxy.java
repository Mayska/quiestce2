package com.quiestce.webapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.quiestce.webapp.CustomProperties;
import com.quiestce.webapp.model.Individu;
import com.quiestce.webapp.model.Questionnaire;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class QuestionnaireProxy {
	@Autowired
	private CustomProperties props;

	public Iterable<Questionnaire> getQuestionnaire() {
		String baseApiUrl = props.getApiUrl();
		String getQuestionnaireUrl = baseApiUrl + "/questionnaire";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Iterable<Questionnaire>> response = restTemplate.exchange(getQuestionnaireUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Iterable<Questionnaire>>() {
				});
		
		return response.getBody();
	}

}
