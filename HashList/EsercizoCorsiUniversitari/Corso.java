package EsercizoCorsiUniversitari;

import java.util.HashSet;

public class Corso {
	private String nomeCorso;
	private String nomeDocente;
	private int crediti;
	private HashSet<Studente> studenti;
	private int postiDisponibili;
	private int disponibili;
	
	
	public Corso(String nome, String nomeDocente, int crediti, HashSet<Studente> studenti, int postiDisponibili) {
		nomeCorso = nome;
		this.nomeDocente= nomeDocente;
		this.crediti = crediti;
		this.studenti = studenti;
		this.postiDisponibili = postiDisponibili;
		
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public String getNomeDocente() {
		return nomeDocente;
	}

	public int getCrediti() {
		return crediti;
	}

	public HashSet<Studente> getStudenti() {
		return studenti;
	}
	public int getPostiTOT() {
		return postiDisponibili;
	}

	public int mostraPostiDispobibili() {
		disponibili = postiDisponibili - studenti.size();
		return disponibili;
	}
	public boolean aggiungiStudente(Studente s) {
		if(disponibili > 0) {
			studenti.add(s);
			return true;
		}else {
			return false;
		}
		
	}
	public void mostraMatricole() {
		for( Studente matricola : studenti ) {
			System.out.println("Matricola: "+matricola.getMatricola());
		}
		
	}
}
