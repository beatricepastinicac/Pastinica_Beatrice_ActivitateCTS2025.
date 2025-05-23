package subiecte.d.s8.strategy;

public class Comanda {
    private String client;
    private double total;
    private StrategiePlata metodaPlata;

    public Comanda(String client, double total) {
        this.client = client;
        this.total = total;
    }

    public void setMetodaPlata(StrategiePlata strategie) {
        this.metodaPlata = strategie;
    }

    public void proceseazaPlata() {
        if (metodaPlata == null) {
            System.out.println("Metoda de plata nu a fost setata.");
        } else {
            metodaPlata.plateste(client, total);
        }
    }
}
