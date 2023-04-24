package Es1;

import Studente.Studente;

public class ProvaClasseStudenti {

	public static void main(String[] args) {
		
		Classe c = new Classe(4);
		
		Studente s1 = new Studente("Luca","Fornasiero", "Vis dan Gimignano", "12");
		c.inserisciStudente(s1);
		System.out.println("numeri disponbili nella classe "+c.getPostiDisponibili());
		s1.getMatricola();
		
		
		Studente s2 = new Studente("Luca","Fornasiero", "Vis dan Gimignano", "3345");
		c.inserisciStudente(s2);
		s2.getMatricola();
		System.out.println("numeri disponbili nella classe "+c.getPostiDisponibili());
		
		Studente s3 = new Studente("Luca","Fornasiero", "Vis dan Gimignano", "2345");
		c.inserisciStudente(s3);
		s3.getMatricola();
		System.out.println("numeri disponbili nella classe "+c.getPostiDisponibili());
		
		Studente s4 = new Studente("Luca","Fornasiero", "Vis dan Gimignano","45");
		c.inserisciStudente(s4);
		s4.getMatricola();
		System.out.println("numeri disponbili nella classe "+c.getPostiDisponibili());
	
		
		Studente s5 = new Studente("Luca","Fornasiero", "Vis dan Gimignano","777");
		c.inserisciStudente(s5);
		s5.getMatricola();
		System.out.println("numeri disponbili nella classe "+c.getPostiDisponibili());
		System.out.println(c.getPostiDisponibili());
		
		c.stampaClasse();
		System.out.println("");
		c.rimuoviStudente(s3);
		c.stampaClasse();
		
		
	}

}
