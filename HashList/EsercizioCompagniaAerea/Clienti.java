package EsercizioCompagniaAerea;

import java.util.Objects;

public class Clienti {
	private String cliente;
	
	Clienti(String cliente){
		this.cliente = cliente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clienti other = (Clienti) obj;
		return Objects.equals(cliente, other.cliente);
	}
	
	@Override
	public String toString() {
		return cliente;
		
	}
}
