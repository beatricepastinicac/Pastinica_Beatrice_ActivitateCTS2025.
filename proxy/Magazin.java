package subiecte.d.s9.proxy;

import java.util.*;

public class Magazin implements IMagazin {
    private Map<String, String> credentiale = new HashMap<>();

    public Map<String, String> getCredentiale() {
        return credentiale;
    }

    @Override
    public void inregistreazaClient(IClient client, String parola) {
        credentiale.put(client.getEmail(), parola);
    }
}
