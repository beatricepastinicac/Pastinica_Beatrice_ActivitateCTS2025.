package subiecte.d.s10.chainOfResponsability;

public class Produs {
    private String denumire;
    private String culoare;
    private int marime;
    private String brand;

    public Produs(String denumire, String culoare, int marime, String brand) {
        this.denumire = denumire;
        this.culoare = culoare;
        this.marime = marime;
        this.brand = brand;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getMarime() {
        return marime;
    }

    public String getBrand() {
        return brand;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public String toString() {
        return denumire + " - " + culoare + " - marime " + marime + " - brand " + brand;
    }
}