public class Main {
    public static void main(String[] args) {
        FabricaJucatori fabricaJucatori = new FabricaJucatori();

        Jucator portar = fabricaJucatori.creareJucator(CategoriaJucator.PORTAR, "John");
        Jucator fundas = fabricaJucatori.creareJucator(CategoriaJucator.FUNDAS, "Michael");
        Jucator atacant = fabricaJucatori.creareJucator(CategoriaJucator.ATACANT, "David");

        System.out.println(portar.getNume() + " - " + portar.getPozitie());
        System.out.println(fundas.getNume() + " - " + fundas.getPozitie());
        System.out.println(atacant.getNume() + " - " + atacant.getPozitie());
    }
}
