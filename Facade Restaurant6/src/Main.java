public class Main {
    public static void main(String[] args) {
        VerificareMasaFacade verificator = new VerificareMasaFacade();

        if (verificator.esteMasaPregatita()) {
            System.out.println("Masa este pregatita pentru un nou client.");
        } else {
            System.out.println("Masa nu este pregatita pentru un nou client.");
        }
    }
}
