package EsercizioMolo;
import EsercizioMolo.Barca;
import TryCatch.Divisione0;
public class Molo {
	Barca[] barche;
	int postiBarca;
	public String codice;
	
	 

	    public static Molo crea(String codiceMolo, int postiBarca) {
	        Molo molo = new Molo();
	        molo.postiBarca = postiBarca;
	        molo.barche = new Barca[postiBarca];
	        return molo;
	    }
	
	//incompleto
	
	
	public boolean libero(int indice) {
		if(barche[indice] == null)
			return true;
		else 
			return false;
	}
	
	public void assegnaPostoBarca(Barca b) throws ExceptionPostiBarche {
		if(postiBarca > 0) {
			for(int i = 0; i < barche.length; i++) {
				if(barche[i]==null) {//se l'indice è nullo allora inserire nuova barca
					barche[i] = b;
					postiBarca--;
					break;
				}
			}
		}else if(postiBarca <= 0){
			throw new ExceptionPostiBarche();
		}
		
	}
	
	public void liberaPostoBarca(int indice) {
		barche[indice] = null;
	}
	
	//incompleto 
	public  String dammiBarca(int indice) throws ExceptionPostiBarche {

			return barche[indice].getNomeBarca();
	}
	
	
	public int dammiUnPostoLibero(){
		for(int i = 0; i < barche.length; i++) {
			if(barche[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	//incompleto
	public void compattaBarche() {
        int i, countNulli=0;
        for (i=0;i<barche.length;i++) {
            if (barche[i]==null)
                countNulli++;
        }

        if (countNulli==barche.length)
            return;

        int j, countUltimiNulli=0;
        for (j=barche.length-1;j>0;j--) {
            if (barche[j]==null && barche[j-1]==null)
                countUltimiNulli++;
            else
                break;
        }

        if (countNulli == countUltimiNulli)
            return;
        else {
            int r;
            for(r=0;r<(countNulli-countUltimiNulli);r++) {
                int g;
                for (g=0;g<barche.length;g++)
                if (barche[g] != null)
                    break;
                else if (barche[g] == null) {
                    int l;
                    for (l = g + 1; l < barche.length; l++) {
                        barche[l - 1] = barche[l];
                    }
                }
            }
        }
    }
}
