public class Main {
    public static void main(String[] args) {
        Bilet biletObisnuit = new BiletObisnuit();
        RezervareBilet rezervareBilet = new RezervareBilet(biletObisnuit);
        rezervareBilet.rezervaBilet();


        Bilet biletCuMesaj = new BiletCuMesajEchipaGazda(new BiletObisnuit());
        RezervareBilet rezervareBiletCuMesaj = new RezervareBilet(biletCuMesaj);
        rezervareBiletCuMesaj.rezervaBilet();
    }
}
