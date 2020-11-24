package com.cda.data;

public class Professeur  extends Employer {

	private String specialite;
	
	public Professeur(String pNom, String pPrenom, int pSalaire, String pSpecialite) {
		super(pNom, pPrenom, pSalaire);
		this.specialite = pSpecialite;
	}
	
	@Override
	public String toString() {
		return "Je suis le Professeur "+ this.nom +"  "+ this.prenom + " mon salaire est "+this.salaire+" ma spécialité est "+this.specialite;
	}
	
	@Override
	public int compareTo(Employer pAutreEmployer) {
		int resultatComparaisonPrenom = this.prenom.compareTo(pAutreEmployer.prenom);
		
		if(resultatComparaisonPrenom == 0) {
			return Integer.compare(pAutreEmployer.salaire,this.salaire);
		} else {
			return resultatComparaisonPrenom;
		}
	}
	
}
