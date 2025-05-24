package subiecte.d.s1.composite;

public class TulpinaVirusului implements Virus {
    private String denumire;
    private int nrCazuri;
    private String severitate;

    public TulpinaVirusului(String denumire, int nrCazuri, String severitate){
        this.denumire=denumire;
        this.nrCazuri=nrCazuri;
        this.severitate=severitate;
    }

    @Override
    public void adauga(Virus v){
        throw new UnsupportedOperationException("Tulpinile nu pot contine subcomponente.");
    }

    @Override
    public void sterge(Virus v){
        throw new UnsupportedOperationException("Tulpinile nu pot contine subcomponente.");
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare +
                "- Tulpină: " + denumire
                + " | Cazuri: " + nrCazuri +
                " | Severitate: " + severitate);
    }
    @Override
    public int getNrCazuri() {
        return nrCazuri;
    }
}
