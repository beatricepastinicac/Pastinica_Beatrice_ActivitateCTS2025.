package subiecte.d.s3.strategy;

import java.util.*;

public class Magazin {
    private List<IProdus> produse;
    private StrategieVizualizare strategie;

    public Magazin(List<IProdus> produse) {
        this.produse = produse;
    }

    public void setStrategie(StrategieVizualizare strategie) {
        this.strategie = strategie;
    }

    public void afiseazaProduse() {
        if (strategie == null) {
            System.out.println("Nu exista strategie setata.");
            return;
        }
        List<IProdus> lista = strategie.aplicaStrategie(produse);
        lista.forEach(System.out::println);
    }
}
