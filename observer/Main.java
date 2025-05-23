package subiecte.d.s8.observer;

public class Main {
    public static void main(String[] args) {
        SubiectReduceri magazin = new SubiectReduceri();

        IClient client1 = new ClientEmail("ana@email.com");
        IClient client2 = new ClientTelefon("0730000000");
        IClient client3 = new ClientEmail("radu@email.com");

        magazin.aboneaza(client1);
        magazin.aboneaza(client2);
        magazin.aboneaza(client3);

        System.out.println(">>> Aplicare reducere:");
        magazin.notificaReducere("Reducere 20% la toate laptopurile!");

        magazin.dezaboneaza(client3);

        System.out.println(">>> Reducere noua:");
        magazin.notificaReducere("Transport gratuit la comenzile de peste 300 RON!");
    }
}
