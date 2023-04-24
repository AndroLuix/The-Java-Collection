package EsercizioMolo;
import java.util.Scanner;
public class ProvaMolo {

	public static void main(String[] args) throws ExceptionPostiBarche {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Molo molo1 = Molo.crea("molo11",5);
		
		Barca barca1 = new Barca("Adelante");
		Barca barca2 = new Barca("MI88");
		Barca barca3 = new Barca("Dicis");
		Barca barca4 = new Barca("MG A");
	
		try {
		//inserimento di barche
		molo1.assegnaPostoBarca(barca1);
		molo1.assegnaPostoBarca(barca2);
		molo1.assegnaPostoBarca(barca3);
		//molo1.assegnaPostoBarca(barca4);
		
		
		//verifica dammi barca
		System.out.println(molo1.dammiBarca(0));;
		System.out.println(molo1.dammiBarca(1));;
		//System.out.println(molo1.dammiBarca(4)); funziona
		System.out.println(molo1.dammiBarca(2));;
		System.out.println("");
		
		
		//verifica metodo libero
		System.out.println(molo1.libero(0)); //false ok
		System.out.println(molo1.libero(1)); //false ok
		System.out.println(molo1.libero(2)); //false ok
		System.out.println(molo1.libero(3)); //true ok
		System.out.println(molo1.libero(4));
		System.out.println("");
		//System.out.println(molo1.libero(5)); // catch: ArrayIndexOutOfBoundsException 
		
		
		//verfica metodo libero
		molo1.liberaPostoBarca(0);
		molo1.liberaPostoBarca(1);
		molo1.liberaPostoBarca(2);
		System.out.println(molo1.libero(0)); // true si è liberato.
		System.out.println(molo1.libero(1)); // true si è liberato.
		System.out.println(molo1.libero(2)); // true si è liberato.
		System.out.println(molo1.dammiUnPostoLibero());
		System.out.println("");
		
		//verifica compatta barche 
		
		molo1.assegnaPostoBarca(barca1);
		molo1.assegnaPostoBarca(barca2);
		molo1.compattaBarche();
		
		
		
		
		
		
		
		} catch (ExceptionPostiBarche e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Non vi e' una barca perche' non esiste il posto "+e );
		}catch(NullPointerException e) {
			System.out.println("non vi e' alcuna barca all'indice selezionato ");
		}
		
		
	}

}
