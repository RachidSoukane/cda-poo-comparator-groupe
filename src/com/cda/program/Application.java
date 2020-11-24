package com.cda.program;

import java.util.ArrayList;
import java.util.List;

import com.cda.data.Employer;
import com.cda.data.Etudiant;
import com.cda.data.Professeur;

public class Application {

	public static void main(String[] args) {
		ArrayList<Etudiant> vEtudiants = new ArrayList<>();

		Etudiant e1 = new Etudiant("Sebastien", "Zizou", "87543543");
		Etudiant e2 = new Etudiant("Julien", "Chombart", "65678754");
		Etudiant e3 = new Etudiant("Rony", "Fremy", "87543545");
		
		vEtudiants.add(e1);
		vEtudiants.add(e2);
		vEtudiants.add(e3);
		
		iterateList(vEtudiants);
		
		
		ArrayList<Employer> vEmployers = new ArrayList<>();
		
		Employer ep1 = new Employer("Ambroise", "Delalin", 1900);
		Employer ep2 = new Employer("François", "Vandenplas", 1700);
		Employer ep3 = new Employer("Yassine", "Afhim", 2800);
		
		vEmployers.add(ep1);
		vEmployers.add(ep2);
		vEmployers.add(ep3);
		
		iterateList(vEmployers);
		
		
		Professeur p1 = new Professeur("Oussama", "Savaton", 2500, "JAVA/JEE");
		Professeur p2 = new Professeur("Thomas", "Legrand", 2600, "Mathèmatique");		Professeur p3 = new Professeur("Oussama", "Stili", 3000, "JAVA/JEE");

		List<Professeur> vProfesseurs = List.of(p1, p2, p3);
		
		iterateList(vProfesseurs);
	}

	public static <T> void iterateList(List<T> anyList) {
		for (T temp : anyList) {
			System.out.println(temp);
		}
	}
}
