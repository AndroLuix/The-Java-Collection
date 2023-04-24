package ArrayList;

import Studente.Studente;

public class provaStudenti {

	public static void main(String[] args) {
		ClasseList c = new ClasseList(4); //contiene 4 studenti
		Studente s1 = new Studente("marco", "111");
		Studente s2 = new Studente("giovannj", "102");
		Studente s3 = new Studente("luca", "333");
		Studente s4 = new Studente("anton", "444");
		
		c.inserisciStudente(s1);
		c.inserisciStudente(s2);
		c.inserisciStudente(s3);
		
		
		c.stampaClasse();
	}
}
