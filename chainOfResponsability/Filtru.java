package subiecte.d.s10.chainOfResponsability;

import java.util.List;

public abstract class Filtru {
    protected Filtru urmator;

    public void setUrmator(Filtru urmator) {
        this.urmator = urmator;
    }

    public abstract List<Produs> aplicaFiltru(List<Produs> produse);
}
