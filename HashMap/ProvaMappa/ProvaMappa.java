package ProvaMappa;

import java.util.HashMap;
import java.util.Set;



public class ProvaMappa {
	public static void main(String[] args) {
		//hashMap
		//linkedHashMap: garantisce l'ordine delle chiavi (escludendo i cloni)
		
		HashMap<String, Persona> anagrafe = new HashMap<>();
		
		Persona p1 = new Persona ("gio","dep");
		Persona p2 = new Persona ("peppe","ddp");
		Persona p3 = new Persona ("nano","sco");
		
		anagrafe.put("AIUFWHWIU4H3IUT", p1);
		anagrafe.put("QEUIHIWGYWGFFRE", p2);
		anagrafe.put("2Y4875Y83735678", p3);
		
		System.out.println(anagrafe);
		
		anagrafe.put("2Y4875Y83735678", p2);
		System.out.println(anagrafe); //nn è possibile modificarlo
		
		/*
		anagrafe.containsKey(p3)
		anagrafe.containsValue(p3)
		
		restituiscono un booleano se sono presenti i valori o chiavi
		*/
		
	System.out.println(	"ANAGRAFE.GET: "+anagrafe.get("AIUFWHWIU4H3IUT"));//restituisce valore alla chiave (ossia l'oggetto persona)
	
	//anagrafe.isEmpty() //verifica se è vuota, resistuisce booleano
	
	//anagrafe.remove(p3) //passa la chiave e rimuove quella coppia che ha quella chiave;
	
	//anagrafe.remove(p3) //rimuove la chiave oppure il valore(oggetto ossia persona)
	
	//anagrafe.replace(null, p3) //cambia il valore
	
	//anagrafe.replace(null, p2, p3)//si fornisce al metodo replace un nuovo valore, funziona solo se il vecchio valore è collegato
	//a quella mappa
	
	//anagrafe.keySet()//restituisce il set di chiavi. 
	//tutto il set di chiavi che ci sono nella mappa,
	//lo restituisce come HashSet. //qst perché le chiavi non devono essere duplicate
	/*
	 * per questo non può funzionare nelle arrayList
	 * 
	 * 
	 */
	Set<String> chiavi = anagrafe.keySet(); //mi faccio dare tutte le chiavi
	
	for (String chiave : chiavi){
		System.out.println("chiave, codice fiscale: "+chiave); 
	}
	
	for (String chiave : chiavi){
		Persona p = anagrafe.get(chiave); //estrago persona associata alla chiave
		if (p.equals(p2)){ //se qst persona è uguale  quella che sto cercano, la chiave è quella giusta
			System.out.println("chiave di p2: "+chiave);
			//p2 è inserito due volte quindi vi sono due CF 
			//ha trovato due volte l'oggetto p2 xke ci sono 2 CF
			//QUINDI: p2 ha due chiavi
		}
	}
	
	
	
	}

}
