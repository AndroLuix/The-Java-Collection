package EsercizoCorsiUniversitari;

import java.util.Objects;

public class Studente {
	private String nome;
	private String cognome; 
	private String matricola;
	public Studente(String nome, String cognome, String matricola){
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
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
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricola);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		return Objects.equals(matricola, other.matricola);
	}
	@Override
	public String toString() {
		return matricola+" "+cognome;
	}
	
}
