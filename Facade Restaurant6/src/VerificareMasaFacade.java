public class VerificareMasaFacade {
    private Masa masa;

    public VerificareMasaFacade() {
        this.masa = new Masa();
    }

    public boolean esteMasaPregatita() {
        return masa.esteLiber() && masa.esteDebarasata() && masa.auServeteleNoi();
    }
}
