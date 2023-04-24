package Universita;

import java.util.ArrayList;

public class ProvaUNI {

	public static void main(String[] args) {
		
		
		ArrayList<Docente>docenti = new ArrayList<>();
		docenti.add(new Docente ("mari","r", 11,40));
		docenti.add(new Docente ("lc","rew", 114,40));
		docenti.add(new Docente ("madewri","rewf", 1143,20));

		
		  

	
		
		Universita uni = new Universita(docenti);
		uni.listaDocenti();
		

	}

}
