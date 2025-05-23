package subiecte.d.s7.composite;

public class Produs implements IProdus {
    private String nume;
    private int stoc;

    public Produs(String nume, int stoc) {
        this.nume = nume;
        this.stoc = stoc;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "- Produs: " + nume + ", stoc: " + stoc);
    }

    @Override
    public int getStoc() {
        return stoc;
    }
}
