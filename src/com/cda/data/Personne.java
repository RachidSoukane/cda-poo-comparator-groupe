package com.cda.data;

public class Personne {
	// TODO final ou pas final discussion !
	protected final String nom;
	protected final String prenom;
	
	public Personne(String pPrenom, String pNom) {
		this.prenom = pPrenom;
		this.nom = pNom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return this.prenom + " " + this.nom;
	}
	
}

