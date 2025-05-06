public class AdaptereBilet implements eBiletInterfata {
    private Bilete bilete;

    public AdaptereBilet(Bilete bilete) {
        this.bilete = bilete;
    }

    @Override
    public void vindeBilet(String meci, String categorie) {
        // Transformăm metoda vindeBilet din eBilet.ro la metoda rezervaBilet din aplicația firmei
        bilete.rezervaBilet(meci, categorie);
    }
}
