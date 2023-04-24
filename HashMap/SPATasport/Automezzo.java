package SPATasport;
import java.util.*;
public class Automezzo {
	private String targa;
	private Destinazione arrivo;
	public Automezzo(String targa, Destinazione arrivo) {
		super();
		this.targa = targa;
		this.arrivo = arrivo;
	}
	public String getTarga() {
		return targa;
	}
	public Destinazione getArrivo() {
		return arrivo;
	}
	
	public void setArrivo(Destinazione arrivo) {
		this.arrivo = arrivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(arrivo, targa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automezzo other = (Automezzo) obj;
		return Objects.equals(arrivo, other.arrivo) && Objects.equals(targa, other.targa);
	}
	@Override
	public String toString() {
		return "Automezzo [targa=" + targa + ", arrivo=" + arrivo + "]";
	}
	
	
}
