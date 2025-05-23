package subiecte.d.s4.composite;

import java.util.*;

public class CategorieMeniu {
    private String nume;
    private List<IProdus> produse = new ArrayList<>();

    public CategorieMeniu(String nume) {
        this.nume = nume;
    }

    public void adauga(IProdus produs) {
        produse.add(produs);
    }

    public void afiseaza() {
        System.out.println("== " + nume + " ==");
        for (IProdus p : produse) {
            System.out.println(p.getDescriere() + " - " + p.getPret() + " RON");
        }
    }
}
