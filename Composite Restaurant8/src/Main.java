public class Main {
    public static void main(String[] args) {
        SectiuneMeniu meniu = new SectiuneMeniu("Meniu restaurant");

        SectiuneMeniu sectiuneBauturi = new SectiuneMeniu("Bauturi");
        sectiuneBauturi.adauga(new ItemMeniu("Apa plata"));
        sectiuneBauturi.adauga(new ItemMeniu("Apa minerala"));
        sectiuneBauturi.adauga(new ItemMeniu("Suc de portocale"));
        meniu.adauga(sectiuneBauturi);

        SectiuneMeniu sectiuneDesert = new SectiuneMeniu("Desert");
        sectiuneDesert.adauga(new ItemMeniu("Tiramisu"));
        sectiuneDesert.adauga(new ItemMeniu("Cheesecake"));
        meniu.adauga(sectiuneDesert);

        meniu.afisare();
    }
}
