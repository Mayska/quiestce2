package com.quiestce.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiestce.webapp.model.Individu;
import com.quiestce.webapp.repository.IndividuProxy;

import lombok.Data;

@Data
@Service
public class IndividuService {

	@Autowired
	private IndividuProxy individuProxy;

	public Iterable<Individu> getIndividus() {
		return individuProxy.getIndividus();
	}
	
	public Individu getChoisirUnIndividu() {
		return individuProxy.getChoisirUnIndividu();
	}
	

}
