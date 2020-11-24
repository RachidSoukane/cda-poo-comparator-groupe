package com.cda.data;

public class Etudiant extends Personne {
	
	private final String cne;
	
	public Etudiant(String pNom, String pPrenom, String pCne) {
		super(pNom,pPrenom);
		this.cne = pCne;
	}

	@Override
	public String toString() {
		return "Je suis l'�tudiant "+ super.toString() + " mon cne est "+this.cne;
	}
}
