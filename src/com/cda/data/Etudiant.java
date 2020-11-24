package com.cda.data;

public class Etudiant extends Personne implements Comparable<Etudiant> {
	
	private final String cne;
	
	public Etudiant(String pNom, String pPrenom, String pCne) {
		super(pNom,pPrenom);
		this.cne = pCne;
	}

	@Override
	public String toString() {
		return "Je suis l'étudiant "+ super.toString() + " mon cne est "+this.cne;
	}

	@Override
	public int compareTo(Etudiant pAutreEtudiant) {
		return this.prenom.compareTo(pAutreEtudiant.prenom);
	}
}
