package Universita;
import java.util.ArrayList;

public class Universita {
	private ArrayList<Docente> docenti;
	Universita(ArrayList<Docente> docenti){
		this.docenti = docenti;
	}
	
	

	



	/**public void Docenti(Docente a) {
		a.listaDocenti();
	}*/
	public void aggiungiDocente(Docente docente) {
		docenti.add(docente);
	}
	public void listaDocenti() {
		for(int i = 0; i < docenti.size(); i++) {
			System.out.println(docenti.get(i).getCognome());
		}
	}
	
	
	
}
