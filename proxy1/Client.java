package subiecte.d.s9.proxy;

public class Client implements IClient {
    private String email;

    public Client(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
