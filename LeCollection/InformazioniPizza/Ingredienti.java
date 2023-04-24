package InformazioniPizza;

public class Ingredienti{
	private String nome; 
	private double kcal;
	
	Ingredienti(String nome, double kcal){
		this.nome = nome;
		this.kcal = kcal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}
}
