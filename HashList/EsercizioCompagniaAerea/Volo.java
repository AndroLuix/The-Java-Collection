package EsercizioCompagniaAerea;

import java.util.HashSet;
import java.util.LinkedList;

public class Volo {
	//private int posti;
	//private int attesa;
	private int numeroMaxPasseggeri;
	private int postiDisponibili;
	private HashSet<Clienti> posti;
	private  LinkedList <Clienti> attesa;
	
	Volo(int numeroMaxPasseggeri, HashSet<Clienti> posti){
		this.numeroMaxPasseggeri = numeroMaxPasseggeri;
		this.posti = posti;
		postiDisponibili = numeroMaxPasseggeri - posti.size();
		this.attesa = new LinkedList<>();
		
	}
	
	public boolean PrenotaIlVolo(Clienti c) /*throws Exception*/{
		if(postiDisponibili > 0) {
			
			if(posti.add(c) == true) {
			postiDisponibili--;
			//System.out.println("Posto aggiunto");
			return true;
			}else {
				return false;//System.out.println("Cliente gia' presente");
			}
		} else{
			attesa.add(c);
			//return false;
			//System.out.println("Posto non disponibile, messo in lista d'attesa");
			//throw new Exception("Posti Disponibili esauriti, cliente inserito nella lista d'attesa");
		}
		return false;
		
	}
	
	public void DisdiciVolo(Clienti c) {
		if(posti.remove(c) == true) {
	
		postiDisponibili++;
			if(attesa.size() > 0) {
				posti.add(attesa.pollFirst());
			}
		
		}
	}
	
	public void vediListe() {
		for( Clienti posto : posti ) {
			System.out.println("posto: "+posto); 
		}
		for( Clienti attesi : attesa){
			System.out.println("in attesa: "+attesi);
		}
	}
}
