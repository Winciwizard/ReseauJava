package com.campusnum.reseausocialobject;

public class User {

	private String nom, prenom, ville, age ;
	
	public User() {
		nom = "Inconnue";
		prenom ="Inconnue";
		ville ="Inconnue";
		age ="Inconnue";
	}
	
	public User(String pNom, String pPrenom) {
		nom = pNom;
		prenom = pPrenom;
		ville ="Inconnue";
		age ="Inconnue";
	}
	
	public User(String pNom, String pPrenom, String pVille, String pAge) {
		nom = pNom;
		prenom = pPrenom;
		ville = pVille;
		age = pAge;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
