package Universita;

import java.util.ArrayList;

public class Docente {
	private String nome; 
	private String cognome;
	private int codice;
	private int eta;
	private ArrayList<Docente> docenti;
	Docente(String nome, String cognome, 
			int codice, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.eta = eta;
		docenti = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	/**public void listaDocenti() {
		for(int i = 0; i < docenti.size(); i++) {
			System.out.println(docenti.get(i).getCognome());
		}
	}*/
}
