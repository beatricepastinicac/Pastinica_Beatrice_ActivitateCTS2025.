package subiecte.d.s11.chainOfResponsability;

import java.util.Map;

public abstract class HandlerBancnote {
    protected HandlerBancnote urmator;
    protected Bancnota bancnota;

    public HandlerBancnote(Bancnota bancnota) {
        this.bancnota = bancnota;
    }

    public void setUrmator(HandlerBancnote urmator) {
        this.urmator = urmator;
    }

    public abstract void retrage(int suma, Map<Integer, Integer> rezultat) throws ExceptieRetragere;
}