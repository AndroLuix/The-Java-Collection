package GestioneBanca;

import java.util.ArrayList;

public class Banca  {
	private ArrayList<Azioni> contoCorrente= new ArrayList<>();
	public Banca(ArrayList<Azioni> cc){
		contoCorrente = cc;
	}
	
	public void aggiungiConto(Azioni aggiungi_conto){
		contoCorrente.add(aggiungi_conto);
	}
	
	public String visualizzaContiInRosso(){
		for(Azioni cc : contoCorrente) {
			if(cc.leggiSaldo() == 0) {
				 return cc.getNominativoProprietario();
			}
		}return "nessuno ha un conto in rosso";
	}
}
