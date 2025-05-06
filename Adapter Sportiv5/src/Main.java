public class Main {
    public static void main(String[] args) {
        Bilete bileteFirma = new Bilete();
        AdaptereBilet adapter = new AdaptereBilet(bileteFirma);
        adapter.vindeBilet("Meci fotbal", "Peluză");
    }
}
