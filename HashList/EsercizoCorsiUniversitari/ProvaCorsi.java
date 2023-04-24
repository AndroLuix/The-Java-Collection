package EsercizoCorsiUniversitari;

import java.util.HashSet;

public class ProvaCorsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente studente1 = new Studente("Marco", "Domenic", "112");//mat uguale
		Studente studente2 = new Studente("Marco", "Domenic", "113");
		Studente studente3= new Studente("Marco", "Domenic", "114");
		Studente studente4 = new Studente ("Mirko", "Colantuono","112");//matricola uguale
		Studente studente5 = new Studente ("Mirko", "Colantuono","112");//mat uguale
		Studente matricDiversa = new Studente ("Singolo","Rossi","194");
		Studente matricDiversa2 = new Studente ("Singolo","Rossi","183");
		
		
		HashSet<Studente> studenti = new HashSet<>();
		studenti.add(studente1);
		studenti.add(studente2);
		studenti.add(studente3);
		
		
		Corso java = new Corso("java","Napoli",10,studenti, 4);
		System.out.println(java.mostraPostiDispobibili());
		java.mostraMatricole();
		
		System.out.println("");
		//System.out.println(java.getPostiTOT());
		System.out.println(java.aggiungiStudente(studente4));
		System.out.println(java.mostraPostiDispobibili());
		
		System.out.println("");
		System.out.println(java.aggiungiStudente(studente4));
		System.out.println(java.mostraPostiDispobibili());
		System.out.println(java.aggiungiStudente(studente5));
		System.out.println(java.mostraPostiDispobibili());
		System.out.println(java.aggiungiStudente(matricDiversa));
		System.out.println(java.mostraPostiDispobibili());
		System.out.println(java.aggiungiStudente(matricDiversa2));
		System.out.println(java.mostraPostiDispobibili());
		java.mostraMatricole();
		
		
		
	}

}
