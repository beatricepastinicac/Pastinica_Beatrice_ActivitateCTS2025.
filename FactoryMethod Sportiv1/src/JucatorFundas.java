public class JucatorFundas implements Jucator {
    private String nume;

    public JucatorFundas(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getPozitie() {
        return "Fundas";
    }
}
