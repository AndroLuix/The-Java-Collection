package SPATasport;
import java.util.*;

public class Destinazione {
	private String city;
	private int distance;
	public Destinazione(String city, int distance) {
		super();
		this.city = city;
		this.distance = distance;
	}
	public String getCity() {
		return city;
	}
	public int getDistance() {
		return distance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, distance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destinazione other = (Destinazione) obj;
		return Objects.equals(city, other.city) && distance == other.distance;
	}
	@Override
	public String toString() {
		return "Destinazione [city=" + city + ", distance=" + distance + "]";
	}
	
}
