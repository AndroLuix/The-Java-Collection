package SPATasport;
import java.util.ArrayList;
public class ProvaTrasporti {

		public static void main(String[] args) {
			Trasporti t = new Trasporti(3);
			
			
			t.aggiungiDestinazione("Malta", 100);
			t.aggiungiDestinazione("Roma", 20);
			t.aggiungiDestinazione("Milano", 100);
			t.aggiungiDestinazione("Roma", 6);
			
			Destinazione[] d = t.getDestinazioni();
			
			for (Destinazione destinazione : d) {
				System.out.println(destinazione);
			}
			
			
			t.aggiungiMezzo("Targa", "Roma");
			t.aggiungiMezzo("Malra", "Malta");
			t.aggiungiMezzo("RRRR", "Roma");
			t.aggiungiMezzo("asuihdf", "Nessuna");
			t.aggiungiMezzo(null, null);
			t.aggiungiMezzo("Targa", "Milano");
			
			ArrayList<Automezzo> a = t.getMezzi();
			for (Automezzo automezzo : a) {
				System.out.println(automezzo);
			}
			System.out.println(t.stat());
			
			
			t.terminaViaggio("RRRR");
			
			System.out.println(t.stat());
			
			t.assegnaDestinazione("RRRR", "Milano");

			System.out.println(t.stat());
			
			t.eliminaDestinazione("Malta");
			
			a = t.getMezzi();
			for (Automezzo automezzo : a) {
				System.out.println(automezzo);
			}
			d = t.getDestinazioni();
			for (Destinazione destinazione : d) {
				System.out.println(destinazione);
			}
			
			System.out.println(t.stat());

	}

}
