package subiecte.d.s7.composite;

import java.util.*;

public class Categorie implements IProdus {
    private String nume;
    private List<IProdus> produse = new ArrayList<>();

    public Categorie(String nume) {
        this.nume = nume;
    }

    public void adauga(IProdus produs) {
        produse.add(produs);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + ">> Categorie: " + nume + " [" + getStoc() + " produse]");
        for (IProdus p : produse) {
            p.afiseaza(indentare + "   ");
        }
    }

    @Override
    public int getStoc() {
        return produse.stream().mapToInt(IProdus::getStoc).sum();
    }
}
