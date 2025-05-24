package subiecte.d.s7.decorator;

public class Client {
    private String nume;
    private boolean aPlasatPrimaComanda = false;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public boolean estePrimaComanda() {
        return !aPlasatPrimaComanda;
    }

    public void marcheazaComanda() {
        this.aPlasatPrimaComanda = true;
    }
}
