package subiecte.d.s7.decorator;

public class Magazin implements IComanda {
    @Override
    public void plaseazaComanda(Client client, double valoareCos, String adresa) {
        double total = valoareCos + 15;
        System.out.println(client.getNume() + " a plasat comanda de " + total + " RON catre " + adresa);
    }
}
