public class BiletCuMesajEchipaGazda implements Bilet {
    private Bilet bilet;

    public BiletCuMesajEchipaGazda(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet() {
        bilet.rezervaBilet();
        System.out.println("Mesaj de susținere a echipei gazdă: Hai echipa noastră!");
    }
}
