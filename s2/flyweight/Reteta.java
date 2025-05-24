package subiecte.d.s2.flyweight;

public class Reteta {
    private String numePacient;
    private String diagnostic;
    private RecomandareSanatate recomandare;

    public Reteta(String numePacient, String diagnostic, RecomandareSanatate recomandare) {
        this.numePacient = numePacient;
        this.diagnostic = diagnostic;
        this.recomandare = recomandare;
    }

    public void printeaza() {
        recomandare.afiseaza(numePacient, diagnostic);
    }
}

