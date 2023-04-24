package ProvaMappa;

public class Persona {
	String nome;
	String cognome;
	
	Persona (String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}
