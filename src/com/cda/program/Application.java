package com.cda.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cda.data.Employer;
import com.cda.data.Etudiant;
import com.cda.data.Personne;
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
		
		System.out.println("--- Etudiants par ordre d'insertion :");
		iterateList(vEtudiants);
		Collections.sort(vEtudiants);
		System.out.println("\n--- après tri :");
		iterateList(vEtudiants);
		
		System.out.println("\n**\n");
		
		ArrayList<Employer> vEmployers = new ArrayList<>();
		
		Employer ep1 = new Employer("Ambroise", "Delalin", 1900);
		Employer ep2 = new Employer("François", "Vandenplas", 1700);
		Employer ep3 = new Employer("Yassine", "Afhim", 2800);
		
		vEmployers.add(ep1);
		vEmployers.add(ep2);
		vEmployers.add(ep3);
		
		System.out.println("--- Employers par ordre d'insertion :");
		iterateList(vEmployers);
		Collections.sort(vEmployers,Collections.reverseOrder());
		System.out.println("\n--- après tri :");
		iterateList(vEmployers);
		System.out.println("\n**\n");
		
		
		Professeur p1 = new Professeur("Oussama", "Savaton", 2500, "JAVA/JEE");
		Professeur p2 = new Professeur("Thomas", "Legrand", 2600, "Mathèmatique");		Professeur p3 = new Professeur("Oussama", "Stili", 3000, "JAVA/JEE");

		ArrayList<Professeur> vProfesseurs = new ArrayList<>(List.of(p1, p2, p3));
		
		System.out.println("--- Professeurs par ordre d'insertion :");
		iterateList(vProfesseurs);
		Collections.sort(vProfesseurs);
		System.out.println("\n--- après tri :");
		iterateList(vProfesseurs);
		System.out.println("\n**\n");
		
		List<Personne> vPersonnes = new ArrayList<>();
		vPersonnes.add(p1);
		vPersonnes.add(ep1);
		vPersonnes.add(ep2);
		vPersonnes.add(p2);
		vPersonnes.add(e1);
		vPersonnes.add(e2);
		vPersonnes.add(ep3);
		vPersonnes.add(p3);
		vPersonnes.add(e3);
		
		System.out.println("--- Personnes par ordre d'insertion :");
		iterateList(vPersonnes);
		Collections.sort(vPersonnes);
		System.out.println("\n--- après tri :");
		iterateList(vPersonnes);
		System.out.println("\n**\n");
	}

	public static <T> void iterateList(List<T> anyList) {
		for (T temp : anyList) {
			System.out.println(temp);
		}
	}
}
