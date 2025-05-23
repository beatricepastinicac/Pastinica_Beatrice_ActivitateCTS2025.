package subiecte.d.s6.composite;

import java.util.ArrayList;
import java.util.List;

public class ReferendumNational implements AbstractRezultat {
    private List<AbstractRezultat> judete = new ArrayList<>();

    public void adaugaJudet(AbstractRezultat judet) {
        judete.add(judet);
    }

    @Override
    public boolean esteAprobat() {
        long aprobate = judete.stream().filter(AbstractRezultat::esteAprobat).count();
        return aprobate > judete.size() / 2;
    }

    @Override
    public String toString() {
        return "Referendum: " + (esteAprobat() ? "APROBAT" : "RESPINS");
    }
}
