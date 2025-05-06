public class JucatorPortar implements Jucator {
    private String nume;

    public JucatorPortar(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getPozitie() {
        return "Portar";
    }
}
