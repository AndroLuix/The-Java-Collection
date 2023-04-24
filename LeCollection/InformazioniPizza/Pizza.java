package InformazioniPizza;
import java.util.ArrayList;
public class Pizza {
	private String nome;
	private double prezzo;
	private ArrayList<Ingredienti> alimento;
	
	Pizza(String nome, double prezzo){
		this.nome = nome;
		this.prezzo = prezzo; 
		alimento = new ArrayList<>();
	}
	public double kilocalorie() {
		double totKcal = 0;
		 for(Ingredienti calorie : alimento) {
			 totKcal +=calorie.getKcal();
		 }return totKcal;
	}
	public void aggiungiIngrediente(Ingredienti a) {
		alimento.add(a);
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public ArrayList<Ingredienti> getAlimento() {
		return alimento;
	}
	public void setAlimento(ArrayList<Ingredienti> alimento) {
		this.alimento = alimento;
	}
	


	
}
