public class FabricaSupaDeLegume implements FabricaSupa {
    @Override
    public Supa creareSupa() {
        return new SupaDeLegume();
    }
}
