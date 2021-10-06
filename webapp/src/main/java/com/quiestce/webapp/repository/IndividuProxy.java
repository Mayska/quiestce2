package com.quiestce.webapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.quiestce.webapp.CustomProperties;
import com.quiestce.webapp.model.Individu;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class IndividuProxy {

	@Autowired
	private CustomProperties props;

	public Iterable<Individu> getIndividus() {
		String baseApiUrl = props.getApiUrl();
		String getHomeopathiesUrl = baseApiUrl + "/individus";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Iterable<Individu>> response = restTemplate.exchange(getHomeopathiesUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Iterable<Individu>>() {
				});
		
		return response.getBody();
	}
	
	public Individu getChoisirUnIndividu() {
		String baseApiUrl = props.getApiUrl();
		String getHomeopathiesUrl = baseApiUrl + "/jouer";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity <Individu> response = restTemplate.exchange(getHomeopathiesUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Individu>() {
				});
		return response.getBody();
	}

}
