package subiecte.d.s4.decorator;

public class ProdusDeBaza implements IProdus {
    private String denumire;
    private double pret;

    public ProdusDeBaza(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDescriere() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
