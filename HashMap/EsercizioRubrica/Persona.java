package EsercizioRubrica;


public class Persona {
	private String nome;
	private String cognome;
	
	private String email;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome; 

	}
	public void aggiungiEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "ContattoPersona [nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}

	
}
