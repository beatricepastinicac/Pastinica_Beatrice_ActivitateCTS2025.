package subiecte.d.s11.chainOfResponsability;

public class Bancnota {
    private int valoare;
    private int numar;

    public Bancnota(int valoare, int numar) {
        this.valoare = valoare;
        this.numar = numar;
    }

    public int getValoare() {
        return valoare;
    }

    public int getNumar() {
        return numar;
    }

    public void retrage(int bucati) {
        if (bucati > numar) throw new IllegalArgumentException("Bancnote insuficiente.");
        numar -= bucati;
    }
}