package ArrayList;

import java.util.ArrayList;
import Studente.Studente;

public class ClasseList {
	private ArrayList<Studente> studenti;
	private int postiDisponibili;
	
	public ClasseList(int dimensione) {
		studenti = new ArrayList<>();
	}
	
	public boolean inserisciStudente(Studente s) {
		//inseriamo studente nell'arraylist
		//studenti.add(s); //studenti.add aggiunge
		//studenti.clear(); pulisce gli elementi della lista
		//contains se c'è un elemento
		//get indice dell'elemento
		//index of: gli diamo l'ogg e lo va a cercare
		// isemptY verifica se e vuota
		//remove() rimuove l'indice
		//size: permette di sapere quanti indici ci sono.
		if (postiDisponibili >= 0) {
			studenti.add(s);
			postiDisponibili--;
			return true;
		}else {
			return false;
		}
	}
		
		public boolean rimuoviStudente(Studente s) {
			if(studenti.contains(s)) {
				return studenti.remove(s);
				
			}else {
			return false;
		}
	}

		public int getPostiDisponibili() {
			return postiDisponibili;
		}
		
		public void stampaClasse() {
			for(Studente studenti :studenti) {
				System.out.println(studenti);
			}
		}
}
