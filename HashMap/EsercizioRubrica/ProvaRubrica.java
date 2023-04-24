package EsercizioRubrica;

import java.util.HashMap;

public class ProvaRubrica {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Persona c1 = new Persona("Nome","Cognome");
		Persona c2 = new Persona("Nome","Cognome");
		Persona c3 = new Persona("Nome","Cognome");
		Persona c4 = new Persona("Marco","Aurelio");
	
		
		Rubrica rubrica = new Rubrica();
		try {
			//test aggiungi accettato
			//test exception accettato
			//System.out.println("contatto 4 agiunto "+rubrica.aggiungiTelefono("555_000_555", c4));
			System.out.println("contatto 4 agiunto "+rubrica.aggiungiTelefono("1234567891", c4));
			
			//System.out.println(rubrica.aggiungiTelefono("555_000_555", c4));
			
			//test verifica contenuto mancante: 
			System.out.println("contenuto mancante "+rubrica.aggiungiTelefono("1234567890", c2));
			
			//test rimuovi accettato
			//test exception accettato
			System.out.println("rimosso: "+rubrica.rimuoviContatto("1234567891", c4));
			
			//System.out.println(rubrica.rimuoviContatto("555_000_555", c4));
	
			
			//verificato: ha trovato il numero
			//System.out.println("aggiunto: "+rubrica.aggiungiTelefono("555000555", c1)); //non aggiunge peche' non ha 10 cifre ma 9
			//exception accettato
			//System.out.println(rubrica.ricercaContatto("1234567895",c1));
			
			
			System.out.println("contatto 4 agiunto "+rubrica.aggiungiTelefono("1234567891", c4));
			System.out.println("contatto 3 agiunto "+rubrica.aggiungiTelefono("1234567892", c3));
			//System.out.println(rubrica.aggiungie_mail("marco.aurelio@email.com"));
			System.out.println(rubrica.ricercaContatto("1234567891"));
			
			
			
			//System.out.println("ciao");
			
			//System.out.println("prov"+rubrica.aggiungiTelefono("1234567891", c4)); contatto gia' esistente (exist)
			System.out.println("Ricerca tramite nome e cognome: "+rubrica.ricercaContatto("Marco", "Aurelio"));
			
			
			//stampa dell'intera rubrica
			System.out.println("");
			rubrica.mostraRubrica();
			
		} catch (NullPointerException e) {
			System.err.println( "NullPointerException"+": Non e' possibile aggiungere contatto perche' manca il numero telefonico.");
		} 
		catch(Exception e) {
			System.err.println(e);
		}
		
	}

}
