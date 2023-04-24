package EsercizioCompagniaAerea;
import java.util.HashSet;
public class VoloProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clienti cliente = new Clienti("Giacomo");
		Clienti cliente2 = new Clienti("Aldo");
		Clienti cliente3= new Clienti("Giacomo");//uguale
		Clienti cliente4 = new Clienti("Federico"); //uguale
		Clienti Acliente = new Clienti("michele");
		Clienti Acliente2 = new Clienti("studio");
		Clienti Acliente3= new Clienti("filippo");
		Clienti Acliente4 = new Clienti("francesca");
		
		HashSet<Clienti> clienti = new HashSet<>();
		clienti.add(cliente4);
		clienti.add(cliente3);
		clienti.add(cliente2);
		clienti.add(cliente);
		
		
		
		Volo volo = new Volo(4, clienti);
		try {
			System.out.println(volo.PrenotaIlVolo(Acliente));
			System.out.println(volo.PrenotaIlVolo(Acliente4));
			System.out.println(volo.PrenotaIlVolo(Acliente3));;
			System.out.println(volo.PrenotaIlVolo(Acliente2));;
			//volo.PrenotaIlVolo(Acliente3);
			//volo.PrenotaIlVolo(Acliente2);
			volo.vediListe();
			
		} catch (Exception e) {
			System.out.println( e);
		}
	}

}
