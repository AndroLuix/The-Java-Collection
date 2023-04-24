package EsercizioLibro;

import java.util.ArrayList;

public class Libreria {
	private ArrayList<Libro> libro;
	
	Libreria(ArrayList<Libro> libro){
		this.libro = libro;
	}
	
	public void trovaAutore(Libro autore) {
		System.out.println("Libro: "+ autore.getTitolo()+
				", di "+ autore.getAutore());
	}
	
	public int trovaNumLibri(Libro autore) {
		int cont = 0;
		for(Libro tito : libro) {
			if(tito.getAutore().equals(autore.getAutore())) {
				 ++cont;
			}
		} return cont;
	}
	
	public int prezzoSuperiore(Libro autore) {
		int cont = 0;
		for(Libro tito : libro) {
			if(autore.getPrezzo() < tito.getPrezzo()) {
				cont++;
			}
		} return cont;
	}
}
