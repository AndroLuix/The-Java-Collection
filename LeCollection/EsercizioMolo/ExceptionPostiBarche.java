package EsercizioMolo;

public class ExceptionPostiBarche extends Exception {
		//checked excpetion 
		//puoi sovrascrivere i metodi di Exception
		@Override
		public String getMessage() {
			return "Impossibile aggiungere posto barca, posti non disponibili";
		
		}

}
