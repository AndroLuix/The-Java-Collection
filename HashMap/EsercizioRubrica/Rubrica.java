package EsercizioRubrica;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.SortedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rubrica {
	
	private HashMap<String,Persona> rubrica = new HashMap<>();
	
	private String regEx = "^\\d{10}$";
  
	public boolean aggiungiTelefono(String telefono, Persona con) throws Exception {
		Pattern pattern = Pattern.compile(regEx);
	    Matcher matcher = pattern.matcher(telefono);
	    boolean matchFound = matcher.find();
		if(rubrica.get(telefono) == null && 
				(matchFound) &&
				(con != null && telefono != null)) {
			rubrica.put(telefono, con);
			return true;
		}else if(!(matchFound)){
			throw new Exception("Inserirsci solo numeri, 10 cifre");
		}
		else if(con == null || telefono == null) {
			throw new Exception("Inserirsci la persona/numero");
		}else {
			throw new Exception("Contatto gia' esistente nella ribrica");
		}
	}
	
	
	public boolean rimuoviContatto(String telefono, Persona con) throws Exception  {
		if(rubrica.get(telefono) != null) {
			rubrica.remove(telefono, con);
			return true;
		}else {
			throw new Exception("Contatto inesistente nella rubrica");
		}
		
	}
	
	public Persona ricercaContatto(String telefono, Persona con) throws Exception {
		
		 if(rubrica.get(telefono) != null) {
			return rubrica.getOrDefault(telefono, con);
		 }else {
			 throw new Exception("Contatto inesistente nella rubrica");
		 }
	}
	public Persona ricercaContatto(String telefono) throws Exception {
		if(telefono != null && rubrica.get(telefono )!= null) {
			 return rubrica.get(telefono);
		}else if(telefono == null) {
			 throw new Exception("Inserire numero di telefono o nome e cognome");
		}else {
			 throw new Exception("Ricerca fallita: Numero di telefono o contatto inesistente");
		}
		//return null;
		
	}
	
	public String ricercaContatto(String nome, String cognome) throws Exception {
		for(Map.Entry<String,Persona> entry: rubrica.entrySet()) {
			if(entry.getValue().getNome().equals(nome) &&
					entry.getValue().getCognome().equals(cognome)) {
				return entry.getKey();
			}
		}
		throw new Exception("Ricerca fallita: nome e cognome non esistenti nella rubrica");
	}
	
	public void mostraRubrica() {
		SortedMap<String, Persona> sorted = new TreeMap<String, Persona>();
		Set<String> chiavi = rubrica.keySet();
		sorted.putAll(rubrica);
		for(Persona p : sorted.values()) {
			System.out.println(p.toString());
			for (String chiave : chiavi){
				 if(rubrica.get(chiave).equals(p)) {
				System.out.println("numero: "+chiave); 
				break;
				 }
			}
		}
	}
	
}
