package subiecte.d.s2.flyweight;

public class RecomandareSanatate {
    private String text;

    public RecomandareSanatate(String text) {
        this.text = text;
    }

    public void afiseaza(String numePacient, String diagnostic) {
        System.out.println("Pacient: " + numePacient);
        System.out.println("Diagnostic: " + diagnostic);
        System.out.println("Recomandare generala: " + text);
        System.out.println("---------------------------");
    }
}
