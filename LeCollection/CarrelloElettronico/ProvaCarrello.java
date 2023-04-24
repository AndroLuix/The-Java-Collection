package CarrelloElettronico;

public class ProvaCarrello {

	public static void main(String[] args) {
		Carrello spesa = new Carrello(2);
		Articolo ar1 = new Articolo("pane","alimenti",1);
		Articolo ar2 = new Articolo("pollo","alimenti",2.50);
		Articolo ar3 = new Articolo("sapone", "casa", 3);
		spesa.aggiungiArticolo(ar2);
		spesa.aggiungiArticolo(ar1);
		spesa.aggiungiArticolo(ar3);
		
		spesa.stampaArticoli();
		System.out.println("");
		System.out.println(spesa.totale());

	}

}
