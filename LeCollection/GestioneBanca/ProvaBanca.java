package GestioneBanca;

import java.util.ArrayList;

public class ProvaBanca {

	public static void main(String[] args) {
		Azioni cliente1 = new Azioni("Ciro", 0);
		Azioni cliente2 = new Azioni("Giovanni", 30_000);
		
		ArrayList<Azioni> clienti = new ArrayList<>();
		clienti.add(cliente1);
		
		Banca europa = new Banca(clienti);
		europa.aggiungiConto(cliente2);
		
		System.out.println(europa.visualizzaContiInRosso());
	
	}

}
