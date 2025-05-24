package subiecte.d.s4.composite;

public class ProdusIndividual implements IProdus {
    private String nume;
    private double pret;

    public ProdusIndividual(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getDescriere() {
        return nume;
    }

    public double getPret() {
        return pret;
    }
}