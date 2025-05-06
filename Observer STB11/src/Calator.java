public class Calator implements Observer {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String message) {
        System.out.println(nume + " a fost notificat că autobuzul a plecat de la capăt de linie. Mesaj: " + message);
    }
}
