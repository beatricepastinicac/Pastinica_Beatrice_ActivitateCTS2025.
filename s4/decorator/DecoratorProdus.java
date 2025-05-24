package subiecte.d.s4.decorator;

public abstract class DecoratorProdus implements IProdus {
    protected IProdus produs;

    public DecoratorProdus(IProdus produs) {
        this.produs = produs;
    }

    public double getPret() {
        return produs.getPret();
    }
}