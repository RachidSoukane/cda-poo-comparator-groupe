package com.cda.data;

public class Employer  extends Personne {
	
	protected int salaire;
	
	public Employer(String pNom, String pPrenom, int pSalaire) {
		super(pNom, pPrenom);
		this.salaire = pSalaire;
	}
}
