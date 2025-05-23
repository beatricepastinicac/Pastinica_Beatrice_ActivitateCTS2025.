package subiecte.d.s5.proxy;

public class Vizitator {
    private String nume;
    private String pacientVizitat;

    public Vizitator(String nume, String pacientVizitat) {
        this.nume = nume;
        this.pacientVizitat = pacientVizitat;
    }

    public String getNume() {
        return nume;
    }

    public String getPacientVizitat() {
        return pacientVizitat;
    }
}
