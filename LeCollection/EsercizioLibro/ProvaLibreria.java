package EsercizioLibro;

import java.util.ArrayList;

public class ProvaLibreria {
	
	public static void main(String[] args) {
		Libro michele = new Libro("Michele", "Da Vicino", 7.99 );
		Libro giovanni = new Libro("giovanni", "Il Bianco", 11.99);
		Libro lorenzo = new Libro("lorenzo", "Verde", 9.99);
		Libro lorenzo1 = new Libro("lorenzo", "giallo", 9.99);
		Libro lorenzo2 = new Libro("lorenzo", "girgio", 9.99);
		
		ArrayList<Libro>autori = new ArrayList<>();
		
		
		autori.add(lorenzo);
		autori.add(giovanni);
		autori.add(michele);
		autori.add(lorenzo2);
		autori.add(lorenzo1);
		
		
		
		Libreria libreria = new Libreria(autori);
		
		libreria.trovaAutore(lorenzo);
		System.out.println(libreria.trovaNumLibri(lorenzo));
		
		System.out.println("libro con consto supreiore a "+libreria.prezzoSuperiore(michele));
	}
	
}
