package subiecte.d.s9.proxy;

import java.time.*;
import java.util.*;

public class ProxyAutentificareSecurizata implements IAutentificare {
    private IAutentificare autentificare;
    private Map<String, List<LocalDateTime>> incercari = new HashMap<>();
    private Set<String> conturiBlocate = new HashSet<>();

    public ProxyAutentificareSecurizata(IAutentificare autentificare) {
        this.autentificare = autentificare;
    }

    @Override
    public boolean autentifica(String email, String parola) {
        if (conturiBlocate.contains(email)) {
            System.out.println("Contul " + email + " este blocat.");
            return false;
        }

        boolean rezultat = autentificare.autentifica(email, parola);
        if (!rezultat) {
            incercari.putIfAbsent(email, new ArrayList<>());
            incercari.get(email).add(LocalDateTime.now());
            curataIncercari(email);
            if (incercari.get(email).size() >= 5) {
                conturiBlocate.add(email);
                System.out.println("Contul " + email + " a fost blocat pentru multiple incercari esuate.");
            } else {
                System.out.println("Parola gresita pentru " + email);
            }
        } else {
            incercari.remove(email);
            System.out.println("Autentificare reusita pentru " + email);
        }
        return rezultat;
    }

    private void curataIncercari(String email) {
        List<LocalDateTime> lista = incercari.get(email);
        lista.removeIf(t -> Duration.between(t, LocalDateTime.now()).toHours() >= 1);
    }

    public void resetCont(String email) {
        conturiBlocate.remove(email);
        incercari.remove(email);
        System.out.println("Contul " + email + " a fost deblocat.");
    }
}
