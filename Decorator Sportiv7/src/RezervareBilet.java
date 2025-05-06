public class RezervareBilet {
    private Bilet bilet;

    public RezervareBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    public void rezervaBilet() {
        bilet.rezervaBilet();
    }
}
