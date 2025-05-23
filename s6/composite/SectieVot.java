package subiecte.d.s6.composite;

public class SectieVot implements AbstractRezultat {
    private String nume;
    private int voturiDa;
    private int voturiNu;

    public SectieVot(String nume, int voturiDa, int voturiNu) {
        this.nume = nume;
        this.voturiDa = voturiDa;
        this.voturiNu = voturiNu;
    }

    @Override
    public boolean esteAprobat() {
        return voturiDa > voturiNu;
    }

    @Override
    public String toString() {
        return nume + ": " + (esteAprobat() ? "APROBAT" : "RESPINS");
    }
}
