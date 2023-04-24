package EsercizioLibro;

import java.util.ArrayList;

public class Libro {
	private String titolo;
	private String autore;
	private double prezzo;
	private ArrayList<Libro> autori;
	
	Libro(String autore, String titolo, double prezzo){
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
		//autori = new ArrayList<>();
	}

	public ArrayList<Libro> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Libro> autori) {
		this.autori = autori;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
