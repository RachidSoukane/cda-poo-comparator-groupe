package com.cda.data;

public class Professeur  extends Employer {

	private String specialite;
	
	public Professeur(String pPrenom, String pNom, int pSalaire, String pSpecialite) {
		super(pPrenom, pNom, pSalaire);
		this.specialite = pSpecialite;
	}
	
	@Override
	public String toString() {
		return "Je suis le Professeur "+ this.prenom +"  "+ this.nom + " mon salaire est "+this.salaire+" ma spécialité est "+this.specialite;
	}
	
	public int compareTo(Professeur pAutreProfesseur) {
		int resultatComparaisonPrenom = this.prenom.compareTo(pAutreProfesseur.prenom);
		
		if(resultatComparaisonPrenom == 0) {
			return Integer.compare(pAutreProfesseur.salaire,this.salaire);
		} else {
			return resultatComparaisonPrenom;
		}
	}
	
}
