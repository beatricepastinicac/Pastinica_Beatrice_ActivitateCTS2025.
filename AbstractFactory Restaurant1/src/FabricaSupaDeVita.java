public class FabricaSupaDeVita implements FabricaSupa {
    @Override
    public Supa creareSupa() {
        return new SupaDeVita();
    }
}
