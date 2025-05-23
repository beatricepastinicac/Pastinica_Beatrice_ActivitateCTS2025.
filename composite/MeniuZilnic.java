package subiecte.d.s4.composite;

import java.util.*;

public class MeniuZilnic implements IProdus {
    private String nume;
    private List<IProdus> produse = new ArrayList<>();

    public MeniuZilnic(String nume) {
        this.nume = nume;
    }

    public void adauga(IProdus produs) {
        produse.add(produs);
    }

    public String getDescriere() {
        return "Meniu Zilnic: " + nume;
    }

    public double getPret() {
        double total = produse.stream().mapToDouble(IProdus::getPret).sum();
        return total * 0.9;
    }
}
