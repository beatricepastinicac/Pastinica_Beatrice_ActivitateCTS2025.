package subiecte.d.s9.proxy;

import java.util.Map;

public class AutentificareSimpla implements IAutentificare {
    private Map<String, String> credentiale;

    public AutentificareSimpla(Map<String, String> credentiale) {
        this.credentiale = credentiale;
    }

    @Override
    public boolean autentifica(String email, String parola) {
        return credentiale.containsKey(email) && credentiale.get(email).equals(parola);
    }
}
