package subiecte.d.s4.composite;

public class Main {
    public static void main(String[] args) {
        ProdusIndividual cafea = new ProdusIndividual("Cafea", 8);
        ProdusIndividual omleta = new ProdusIndividual("Omleta", 14);
        ProdusIndividual ciorba = new ProdusIndividual("Ciorba de vacuta", 20);
        ProdusIndividual friptura = new ProdusIndividual("Friptura de pui", 30);
        ProdusIndividual salata = new ProdusIndividual("Salata fresh", 15);

        MeniuZilnic meniuPranz = new MeniuZilnic("Pranz Energizant");
        meniuPranz.adauga(ciorba);
        meniuPranz.adauga(friptura);
        meniuPranz.adauga(salata);

        CategorieMeniu micDejun = new CategorieMeniu("Mic Dejun");
        micDejun.adauga(cafea);
        micDejun.adauga(omleta);

        CategorieMeniu pranz = new CategorieMeniu("Pranz");
        pranz.adauga(meniuPranz);
        pranz.adauga(salata);

        micDejun.afiseaza();
        pranz.afiseaza();
    }
}
