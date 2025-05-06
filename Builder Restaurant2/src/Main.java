public class Main {
    public static void main(String[] args) {
        Rezervare.RezervareBuilderImpl builder = new Rezervare.RezervareBuilderImpl();
        Rezervare rezervare = builder
                .asezareLaGeam(true)
                .decorareMasa(true)
                .genMuzica("Jazz")
                .build();

        System.out.println("Rezervare cu urmatoarele optiuni:");
        System.out.println("Asezare la geam: " + rezervare.isAsezareLaGeam());
        System.out.println("Decorare masa: " + rezervare.isDecorareMasa());
        System.out.println("Gen muzica: " + rezervare.getGenMuzica());
    }
}
