package subiecte.d.s4.decorator;

public class Italienesc extends DecoratorProdus {
    public Italienesc(IProdus produs) {
        super(produs);
    }

    public String getDescriere() {
        return produs.getDescriere() + " cu specific italienesc (mozzarella, oregano)";
    }
}
