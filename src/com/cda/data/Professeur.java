package com.cda.data;

public class Professeur  extends Employer  {

	private String specialite;
	
	public Professeur(String pNom, String pPrenom, int pSalaire, String pSpecialite) {
		super(pNom, pPrenom, pSalaire);
		this.specialite = pSpecialite;
	}
	
	@Override
	public String toString() {
		return "Je suis le Professeur "+ super.toString() + " mon salaire est "+this.salaire+" ma spécialité est "+this.specialite;
	}
	
}
