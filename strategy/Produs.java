package subiecte.d.s3.strategy;

public class Produs implements IProdus {
    private String denumire;
    private double pret;
    private int nrRecenzii;

    public Produs(String denumire, double pret, int nrRecenzii) {
        this.denumire = denumire;
        this.pret = pret;
        this.nrRecenzii = nrRecenzii;
    }

    public String getDenumire() { return denumire; }
    public double getPret() { return pret; }
    public int getNrRecenzii() { return nrRecenzii; }

    @Override
    public String toString() {
        return denumire + " - " + pret + " RON - Recenzii: " + nrRecenzii;
    }
}
