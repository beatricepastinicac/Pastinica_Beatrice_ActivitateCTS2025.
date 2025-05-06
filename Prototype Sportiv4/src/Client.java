public class Client implements ClientClonabil {
    private String nume;
    private String adresa;
    private String email;

    public Client(String nume, String adresa, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
    }

    @Override
    public Client clone() {
        try {
            return (Client) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }
}
