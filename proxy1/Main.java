package subiecte.d.s9.proxy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> credentiale = Map.of(
                "ana@email.com", "1234",
                "radu@email.com", "parola",
                "maria@email.com", "mypass"
        );

        IAutentificare auth = new AutentificareSimpla(credentiale);
        ProxyAutentificareSecurizata proxy = new ProxyAutentificareSecurizata(auth);

        for (int i = 0; i < 6; i++) {
            proxy.autentifica("ana@email.com", "gresit");
        }

        proxy.autentifica("ana@email.com", "1234"); // cont blocat

        proxy.resetCont("ana@email.com");
        proxy.autentifica("ana@email.com", "1234"); // acum reuseste
    }
}
