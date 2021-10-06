package com.quiestce.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "individu")
public class Individu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String prenom;
	
	private boolean sex;
	
	private boolean chapeaux;
	
	private boolean yeux;
	
	@Column(name="couleur_cheveux")
	private String couleurCheveux;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public boolean isChapeaux() {
		return chapeaux;
	}

	public void setChapeaux(boolean chapeaux) {
		this.chapeaux = chapeaux;
	}

	public boolean isYeux() {
		return yeux;
	}

	public void setYeux(boolean yeux) {
		this.yeux = yeux;
	}

	public String getCouleurCheveux() {
		return couleurCheveux;
	}

	public void setCouleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}

}
