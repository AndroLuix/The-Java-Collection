package ProvaTreeSet;

import java.util.Comparator;

import java.util.TreeSet;
import EsercizoCorsiUniversitari.Studente;

public class Treeeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> parole = new TreeSet<>();
		
		parole.add("Java");
		parole.add("C++");
		parole.add("Pascal");
		
		//mette in ordine alfabetico
		System.out.println(parole);
		
		TreeSet<Integer> numeri = new TreeSet<>();
		
		numeri.add(60);
		numeri.add(45);
		numeri.add(48);
		numeri.add(16);
		
		//in ordine crescente
		System.out.println(numeri);
		
		TreeSet<Studente> studenti = new TreeSet<>
		(new Comparator<Studente>() {
			@Override
		public int compare(Studente o1, Studente o2) {
			return o1.getMatricola().compareTo(o2.getMatricola());
			}
		});
		
		Studente s1 = new Studente ("Marco", "giuse", "834");
		Studente s2 = new Studente ("Roberto","Baldi","111");
		Studente s3 = new Studente ("Roberto","Baldi","123");
		Studente s4 = new Studente ("Roberto","Baldi","88");
		
		studenti.add(s4);
		studenti.add(s3);
		studenti.add(s2);
		studenti.add(s1);
		
		System.out.println(studenti);



	}

}
