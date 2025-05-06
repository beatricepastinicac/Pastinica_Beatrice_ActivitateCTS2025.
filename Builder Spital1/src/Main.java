public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient.PacientBuilder("Ion Popescu")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .setPapuciDeCamera(false)
                .setHalatPentruInterior(true)
                .build();

        Pacient pacient2 = new Pacient.PacientBuilder("Maria Ionescu")
                .build();

        System.out.println(pacient1);
        System.out.println(pacient2);
    }
}
