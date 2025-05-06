public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        Calator calator1 = new Calator("Calator1");
        Calator calator2 = new Calator("Calator2");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);

        autobuz.pleacaDeLaCapatDeLinie();
    }
}
