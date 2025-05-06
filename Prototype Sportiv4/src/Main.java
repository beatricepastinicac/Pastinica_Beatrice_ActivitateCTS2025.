public class Main {
    public static void main(String[] args) {
        Client clientOriginal = new Client("John Doe", "Str. Primaverii 10", "john.doe@example.com");

        Client clientNou = clientOriginal.clone();

        System.out.println("Client nou:");
        System.out.println("Nume: " + clientNou.getNume());
        System.out.println("Adresa: " + clientNou.getAdresa());
        System.out.println("Email: " + clientNou.getEmail());
    }
}
