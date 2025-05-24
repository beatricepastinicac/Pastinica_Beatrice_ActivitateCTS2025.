package subiecte.d.s8.observer;

public class ClientEmail implements IClient {
    private String email;

    public ClientEmail(String email) {
        this.email = email;
    }

    public void primesteNotificare(String mesaj) {
        System.out.println("Email trimis catre " + email + ": " + mesaj);
    }
}
