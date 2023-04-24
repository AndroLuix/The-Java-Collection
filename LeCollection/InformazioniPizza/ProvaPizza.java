package InformazioniPizza;

public class ProvaPizza {
	public static void main(String[] args) {
		Ingredienti pomodoro = new Ingredienti("pomodoro", 100);
		Ingredienti olio = new Ingredienti("pomodoro", 300);
		Ingredienti impasto = new Ingredienti("pomodoro", 170);
		Ingredienti mozzarella = new Ingredienti("pomodoro", 600);
		
		Pizza margherita = new Pizza("Margherita",6);
		
		margherita.aggiungiIngrediente(pomodoro);
		margherita.aggiungiIngrediente(olio);
		margherita.aggiungiIngrediente(impasto);
		margherita.aggiungiIngrediente(mozzarella);
		
		System.out.println(margherita.kilocalorie());
		
		
		
	}
}
