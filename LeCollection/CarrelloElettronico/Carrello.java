package CarrelloElettronico;

import java.util.ArrayList;

public class Carrello{
	private ArrayList<Articolo> articoli;
	Carrello(int dimensione){
		articoli = new ArrayList<>();
	}
	
	public void aggiungiArticolo(Articolo a){
		articoli.add(a);
	}
	public void rimuoviArticolo(Articolo a) {
		articoli.remove(a);
	}

	
	
	//public double verificaPrezzo(Articolo a) {
	//	return a.getPrezzo();
	//}
	
	public void stampaArticoli() {
		for(int i = 0; i < articoli.size(); i++) {
			
			System.out.println(articoli.get(i).getPrezzo());
			System.out.println(articoli.get(i).getCategoria());
			System.out.println(articoli.get(i).getTitolo());
			System.out.println("");
		}
	}
	public double totale() {
		double spesaTot = 0;
		for (Articolo prodotto:articoli ) {
			spesaTot += prodotto.getPrezzo();
		}
		return spesaTot;
	}
}
