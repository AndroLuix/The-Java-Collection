package SPATasport;
import java.util.ArrayList;
import java.util.HashMap;
public class Trasporti {
	private ArrayList<Automezzo> mezzi = new ArrayList<>();
	private Destinazione[] destinazioni;
	private int nDestinazioni;
	public Trasporti(int max) {
		super();
		destinazioni = new Destinazione[max];
		nDestinazioni = 0;
	}
	
	
	
	
	public ArrayList<Automezzo> getMezzi() {
		return mezzi;
	}




	public Destinazione[] getDestinazioni() {
		return destinazioni;
	}




	public int getnDestinazioni() {
		return nDestinazioni;
	}




	private boolean uniqueDest(String c) {
		for (Destinazione destinazione2 : destinazioni) {
			if(destinazione2!= null && destinazione2.getCity().equalsIgnoreCase(c)) {
				return false;
			}
		}
		return true;
	}
	
	private Destinazione findDest(String c) {
		for (Destinazione destinazione2 : destinazioni) {
			if(destinazione2.getCity().equalsIgnoreCase(c)) {
				return destinazione2;
			}
		}
		return null;
	}
	private Automezzo findMezzo(String targa) {
		for (Automezzo automezzo : mezzi) {
			if(automezzo.getTarga().equals(targa)) {
				return automezzo;
			}
		}
		return null;
	}

	public void aggiungiDestinazione(String città, int distanza) {
		if(nDestinazioni != destinazioni.length) {
			if(città != null && distanza >= 0) {
				if(uniqueDest(città))
					destinazioni[nDestinazioni++] = new Destinazione(città, distanza);
			}
		}
	}
	
	public void aggiungiMezzo(String targa, String arrivo) {
		if(targa != null && arrivo != null) {
			Destinazione d = findDest(arrivo);
			if(d == null) {
				d = new Destinazione(arrivo, 0);
				aggiungiDestinazione(arrivo, 0);
			}
			mezzi.add(new Automezzo(targa, d));
		}
	}
	
	
	public void terminaViaggio(String targa) {
		if(targa != null) {
			Automezzo a = findMezzo(targa);
			if(a != null)
				a.setArrivo(null);
		}
	}
	
	public void assegnaDestinazione(String targa, String città) {
		if(targa != null && città != null) {
			Automezzo a = findMezzo(targa);
			Destinazione d = findDest(città);
			if(a != null && d != null)
				a.setArrivo(d);
		}
	}
	
	public void eliminaDestinazione(String città) {
		if(città != null) {
			for (int i = 0; i < destinazioni.length; i++) {
				if(destinazioni[i] != null && destinazioni[i].getCity().equalsIgnoreCase(città)) {
					for (Automezzo automezzo : mezzi) {
						if(automezzo.getArrivo().getCity().equalsIgnoreCase(città)) {
							automezzo.setArrivo(null);
						}
					}
					destinazioni[i] = null;
					Destinazione[] tmp = new Destinazione[destinazioni.length];
					int cursor = 0;
					for (int j = 0; j < destinazioni.length; j++) {
						if(destinazioni[j] != null)
							tmp[cursor++] = destinazioni[j];
					}
					destinazioni = tmp;
					nDestinazioni--;
				}	
			}
		}
	}
	
	public int stat() {
		int sum = 0;
		int occ = 0; //Non tutti i mezzi hanno una destinazione valida
		for (Automezzo automezzo : mezzi) {
			if(automezzo.getArrivo() != null) {
				sum +=	automezzo.getArrivo().getDistance();
				occ++;
			}
		}
		return sum/occ;
	}
}
