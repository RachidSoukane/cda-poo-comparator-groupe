package com.cda.data;

public class Personne {
	// TODO final ou pas final discussion !
	protected final String nom;
	protected final String prenom;
	
	public Personne(String pNom, String pPrenom) {
		this.nom = pNom;
		this.prenom = pPrenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return nom + " " + prenom;
	}
	
}

