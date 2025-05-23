package subiecte.d.s7.decorator;

public class MagazinCuDiscount implements IComanda {
    private IComanda magazin;

    public MagazinCuDiscount(IComanda magazin) {
        this.magazin = magazin;
    }

    @Override
    public void plaseazaComanda(Client client, double valoareCos, String adresa) {
        if (client.estePrimaComanda()) {
            valoareCos *= 0.9;
            System.out.println("Discount de 10% aplicat pentru " + client.getNume());
            client.marcheazaComanda();
        }
        magazin.plaseazaComanda(client, valoareCos, adresa);
    }
}
