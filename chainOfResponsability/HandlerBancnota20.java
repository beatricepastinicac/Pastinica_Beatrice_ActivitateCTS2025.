package subiecte.d.s11.chainOfResponsability;

import java.util.Map;

public class HandlerBancnota20 extends HandlerBancnote {
    public HandlerBancnota20(Bancnota bancnota) {
        super(bancnota);
    }

    @Override
    public void retrage(int suma, Map<Integer, Integer> rezultat) throws ExceptieRetragere {
        int necesar = suma / bancnota.getValoare();
        int deRetras = Math.min(necesar, bancnota.getNumar());

        if (deRetras > 0) {
            bancnota.retrage(deRetras);
            rezultat.put(bancnota.getValoare(), deRetras);
            suma -= deRetras * bancnota.getValoare();
        }

        if (suma > 0) {
            if (urmator != null)
                urmator.retrage(suma, rezultat);
            else
                throw new ExceptieRetragere("Suma nu poate fi retrasa complet.");
        }
    }
}
