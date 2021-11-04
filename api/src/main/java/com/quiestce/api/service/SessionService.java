package com.quiestce.api.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiestce.api.model.Individu;

@Service
public class SessionService {
	
	@Autowired
	private HttpSession httpSession;
	
	@Autowired
	private IndividuService individuService;
	
	private final String PRENOM = "prenom";
	
	private String prenomChoisi;

	public Individu individuChoisi() {
		Individu individu = individuService.getChoisirUnIndividu();
		String prenom = individu.getPrenom();
		httpSession.setAttribute(PRENOM, prenom);
		this.setPrenomChoisi(prenom);
		return individu;
	}

	public String getPrenomChoisi() {
		return prenomChoisi;
	}

	public void setPrenomChoisi(String prenomChoisi) {
		this.prenomChoisi = prenomChoisi;
	}
	

}
