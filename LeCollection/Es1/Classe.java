package Es1;

import Studente.Studente;

public class Classe {
	
	private Studente[] studenti; //vado ad associargli il parametro d'ingresso
	
	private int postiDisponibili; //tiene conti die posti disponibili nell'array
	
	
	//primo caso per far passare l'array
	//qui bisogna inserire solo la dimensione dell'array
	public Classe(int dimensione) {
		studenti = new Studente[dimensione]; //ci facciamo dire qaunto deve essere grande l'aurla (dimensione array)
		postiDisponibili = dimensione;
	}
	
	
	
	//secondo metodo per far passare l'array
	//qui bisogna dare l'array gia' compilato
	
	public Classe(Studente[] studenti) {
		this.studenti = studenti;
	}
	
	//come facciamo cancellare/aggiungere degli studento (indice array)?
	
	//metodo per aggiungere studente
	public boolean inserisciStudente(Studente s) {
		/**
		 * if(postiDisponibili >0) {
			studenti[studenti.length - postiDisponibili] = s;
			postiDisponibili--;
			return true;
		}else {
			return false;
		}
		 */
		if(postiDisponibili > 0) {
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i]==null) {//se l'indice studente è uguale a nullo allora inserire nuovo studente
				studenti[i] = s;
				postiDisponibili--;
				return true;
			}
		}
	
		}
		return false;
	}
	
	//metodo per rimuovere studente
	public boolean rimuoviStudente(Studente s) {
		for(int i = 0; i<studenti.length; i++) {
			if(studenti[i].equals(s)) {
				studenti[i] = null;
				postiDisponibili++;
				return true;
			}
		}
		return false; //se rientriamo fuori dal ciclo non l'abbiamo trovato
	}
	
	//visualizza posti disponibili
	public int getPostiDisponibili() {
		return postiDisponibili;
	}
	
	//visualizza classi
	public void stampaClasse() {
		for(Studente s:studenti) {
			System.out.println(s);
		}
	}
	
	
}
