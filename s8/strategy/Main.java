package subiecte.d.s8.strategy;

public class Main {
    public static void main(String[] args) {
        Comanda comanda1 = new Comanda("Andrei", 250);
        Comanda comanda2 = new Comanda("Andrei", 430);

        comanda1.setMetodaPlata(new PlataCard());
        comanda1.proceseazaPlata();

        comanda2.setMetodaPlata(new PlataVirament());
        comanda2.proceseazaPlata();
    }
}
