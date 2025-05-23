package subiecte.d.s4.decorator;

public class Spaniol extends DecoratorProdus {
    public Spaniol(IProdus produs) {
        super(produs);
    }

    public String getDescriere() {
        return produs.getDescriere() + " cu specific spaniol (chorizo, usturoi)";
    }
}
