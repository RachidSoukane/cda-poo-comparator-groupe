package com.cda.data;

public abstract class Personne implements Comparable<Personne>{
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
	
	@Override
	public int compareTo(Personne pPersonne) {
		if(this instanceof Professeur && pPersonne instanceof Professeur) {
			return ((Professeur)this).compareTo((Professeur)pPersonne);
		} else if(this instanceof Professeur) {
			return 1;
			
		} else if(this instanceof Etudiant && pPersonne instanceof Etudiant) {
			return ((Etudiant)this).compareTo((Etudiant)pPersonne);
		} else if(this instanceof Etudiant && pPersonne instanceof Professeur) {
			return -1;
		} else if(this instanceof Etudiant && pPersonne instanceof Employer) {
			return 1;
		
		} else if(this instanceof Employer && !(this instanceof Professeur)  
				&& pPersonne instanceof Employer  && !(pPersonne instanceof Professeur) ) {
			return ((Employer)pPersonne).compareTo(((Employer)this));
		} else if(this instanceof Employer && !(this instanceof Professeur) ) {
			return -1;
		}
		return 0;
	}

}

