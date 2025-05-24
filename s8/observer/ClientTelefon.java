package subiecte.d.s8.observer;

public class ClientTelefon implements IClient {
    private String numar;

    public ClientTelefon(String numar) {
        this.numar = numar;
    }

    public void primesteNotificare(String mesaj) {
        System.out.println("SMS trimis catre " + numar + ": " + mesaj);
    }
}
