package moli;

public class Molo {

    private String codice;
    private int postiBarca;
    private Barca[] barche;

    private Molo() {
    }

    public static Molo crea(String codice, int postiBarca) {
        Molo m = new Molo();
        m.codice = codice;
        m.postiBarca = postiBarca;
        m.barche = new Barca[postiBarca];
        return m;
    }

    public int numPostiBarca() {
        return postiBarca;
    }

    public boolean libero(int posto) {
        if (barche[posto]==null)
            return true;
        else
            return false;
    }

    public void assegnaPostoBarca(int posto, String nome) throws PostoOccupatoException{
        if (barche[posto]!=null) {
            throw new PostoOccupatoException();
        } else {
            barche[posto] = new Barca(nome);
        }
    }

    public void liberaPostoBarca(int posto) throws PostoLiberoException{
        if (barche[posto]!=null) {
            barche[posto] = null;
        } else {
            throw new PostoLiberoException();
        }
    }

    public String dammiBarca(int posto) throws PostoLiberoException{
        if (barche[posto]!=null) {
            return barche[posto].getNome();
        } else {
            throw new PostoLiberoException();
        }
    }

    public int dammiUnPostoLibero() {
        int i;
        for (i=0;i<barche.length;i++) {
            if (barche[i]==null)
                return i;
        } return -1;
    }

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

    public void stampaMolo() {
        int liberi=0;

        int i;
        for(i=0;i<barche.length;i++) {
            if (barche[i]!=null)
                System.out.println(i+ ": " +barche[i].getNome());
            else if (barche[i]==null)
                System.out.println(i+ ": libero");
        }
    }
}
