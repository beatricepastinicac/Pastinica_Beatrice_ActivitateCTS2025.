public class FabricaSupaDeCiuperci implements FabricaSupa {
    @Override
    public Supa creareSupa() {
        return new SupaDeCiuperci();
    }
}
