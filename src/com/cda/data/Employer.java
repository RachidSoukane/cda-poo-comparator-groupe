package com.cda.data;

public class Employer  extends Personne {
	
	protected int salaire;
	
	public Employer(String pPrenom, String pNom, int pSalaire) {
		super(pPrenom, pNom);
		this.salaire = pSalaire;
	}

	@Override
	public String toString() {
		return "Je suis l'employer "+ super.toString() + " mon salaire est "+this.salaire;
	}

	public int compareTo(Employer pAutreEmployer) {
		return Integer.compare(this.salaire, pAutreEmployer.salaire);
	}
	
}
