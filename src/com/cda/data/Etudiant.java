package com.cda.data;

public class Etudiant extends Personne {
	
	private final String cne;
	
	public Etudiant(String pPrenom, String pNom, String pCne) {
		super(pPrenom,pNom);
		this.cne = pCne;
	}

	@Override
	public String toString() {
		return "Je suis l'�tudiant "+ super.toString() + " mon cne est "+this.cne;
	}

	public int compareTo(Etudiant pAutreEtudiant) {
		return this.prenom.compareTo(pAutreEtudiant.prenom);
	}
}
