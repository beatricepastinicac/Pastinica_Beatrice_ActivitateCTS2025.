package s1.composite;

public class Main {
    public static void main(String[] args) {

        Virus europa = new Continent("Europa");
        Virus asia = new Continent("Asia");

        Virus romania = new Tara("România");
        Virus germania = new Tara("Germania");
        Virus china = new Tara("China");

        romania.adauga(new TulpinaVirusului("SARS-CoV-2", 20000, "Mare"));
        romania.adauga(new TulpinaVirusului("H1N1", 5000, "Mediu"));
        germania.adauga(new TulpinaVirusului("Norovirus", 1000, "Mică"));

        china.adauga(new TulpinaVirusului("SARS", 15000, "Mare"));
        china.adauga(new TulpinaVirusului("Avian Flu", 4000, "Mediu"));

        europa.adauga(romania);
        europa.adauga(germania);
        asia.adauga(china);

        europa.afiseazaStructura("");
        asia.afiseazaStructura("");

        int totalEuropa = europa.getNrCazuri();
        int totalAsia = asia.getNrCazuri();
        System.out.println("\nTotal cazuri Europa: " + totalEuropa);
        System.out.println("Total cazuri Asia: " + totalAsia);
        System.out.println("Total global: " + (totalEuropa + totalAsia));
    }
}
