package subiecte.d.s6.composite;

import java.util.ArrayList;
import java.util.List;

public class Judet implements AbstractRezultat {
    private String nume;
    private List<AbstractRezultat> sectii = new ArrayList<>();

    public Judet(String nume) {
        this.nume = nume;
    }

    public void adaugaSectie(AbstractRezultat sectie) {
        sectii.add(sectie);
    }

    @Override
    public boolean esteAprobat() {
        long aprobate = sectii.stream().filter(AbstractRezultat::esteAprobat).count();
        return aprobate > sectii.size() / 2;
    }

    @Override
    public String toString() {
        return "Judetul " + nume + ": " + (esteAprobat() ? "APROBAT" : "RESPINS");
    }
}
