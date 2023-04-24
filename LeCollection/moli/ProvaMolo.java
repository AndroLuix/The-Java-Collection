package moli;

public class ProvaMolo {

    public static void main(String[] args) throws PostoOccupatoException {

        Molo m1 = Molo.crea("Molo1", 5);

        m1.stampaMolo();

        System.out.println();
        System.out.println(m1.numPostiBarca());

        System.out.println();
        System.out.println(m1.libero(0));

        System.out.println();
        try {
            m1.assegnaPostoBarca(2, "Barca1");
        } catch(PostoOccupatoException e) {
            System.out.println(e.getMessage());
        }
        m1.stampaMolo();

        System.out.println();

        try {
            m1.assegnaPostoBarca(2, "Barca1");
        } catch(PostoOccupatoException e) {
            System.out.println(e.getMessage());
        }
        try {
            m1.assegnaPostoBarca(3, "Barca2");
        } catch(PostoOccupatoException e) {
            System.out.println(e.getMessage());
        }
        try {
            m1.assegnaPostoBarca(0, "Barca3");
        } catch(PostoOccupatoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        m1.stampaMolo();

        System.out.println();
        System.out.println(m1.libero(0));
        try {
            m1.liberaPostoBarca(0);
        } catch (PostoLiberoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        m1.stampaMolo();
        System.out.println();
        try {
            m1.liberaPostoBarca(0);
        } catch (PostoLiberoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(m1.dammiBarca(2));
        } catch (PostoLiberoException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(m1.dammiBarca(4));
        } catch (PostoLiberoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println(m1.dammiUnPostoLibero());
        System.out.println();

        m1.compattaBarche();
        m1.stampaMolo();


    }
}
