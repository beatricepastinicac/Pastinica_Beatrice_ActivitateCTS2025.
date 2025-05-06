public class JucatorAtacant implements Jucator {
    private String nume;

    public JucatorAtacant(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getPozitie() {
        return "Atacant";
    }
}
