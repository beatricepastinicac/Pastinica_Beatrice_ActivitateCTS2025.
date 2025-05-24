package subiecte.d.s10.chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private List<Produs> produse = new ArrayList<>();

    public void adaugaProdus(Produs p) {
        produse.add(p);
    }

    public List<Produs> getProduse() {
        return produse;
    }

    public List<Produs> cautaProduse(Filtru filtru) {
        return filtru.aplicaFiltru(produse);
    }
}
