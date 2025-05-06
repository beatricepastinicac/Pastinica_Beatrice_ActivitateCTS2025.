public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupaDeLegume = new FabricaSupaDeLegume();
        FabricaSupa fabricaSupaDeCiuperci = new FabricaSupaDeCiuperci();
        FabricaSupa fabricaSupaDeVita = new FabricaSupaDeVita();

        Supa supaDeLegume = fabricaSupaDeLegume.creareSupa();
        Supa supaDeCiuperci = fabricaSupaDeCiuperci.creareSupa();
        Supa supaDeVita = fabricaSupaDeVita.creareSupa();

        supaDeLegume.serveste();
        supaDeCiuperci.serveste();
        supaDeVita.serveste();
    }
}
