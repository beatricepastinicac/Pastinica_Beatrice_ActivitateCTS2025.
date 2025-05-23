package subiecte.d.s8.observer;

import java.util.*;

public class SubiectReduceri {
    private List<IClient> clienti = new ArrayList<>();

    public void aboneaza(IClient client) {
        clienti.add(client);
    }

    public void dezaboneaza(IClient client) {
        clienti.remove(client);
    }

    public void notificaReducere(String mesaj) {
        for (IClient c : clienti) {
            c.primesteNotificare(mesaj);
        }
    }
}
