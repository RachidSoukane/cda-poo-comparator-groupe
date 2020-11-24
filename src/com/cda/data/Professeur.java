package com.cda.data;

public class Professeur  extends Employer  {

	private String specialite;
	
	public Professeur(String pNom, String pPrenom, int pSalaire, String pSpecialite) {
		super(pNom, pPrenom, pSalaire);
		this.specialite = pSpecialite;
	}
	
}
