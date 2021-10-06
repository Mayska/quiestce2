package com.quiestce.webapp.model;

public class Individu {

	private Integer id;
	
	private String prenom;
	
	private boolean sex;
	
	private boolean chapeaux;
	
	private boolean yeux;
	
	private String couleurCheveux;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
