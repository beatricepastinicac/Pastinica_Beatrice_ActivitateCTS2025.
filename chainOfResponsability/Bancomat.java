package subiecte.d.s11.chainOfResponsability;

import java.util.*;

public class Bancomat {
    private HandlerBancnote start;

    public void seteazaLant(HandlerBancnote start) {
        this.start = start;
    }

    public void retrage(int suma) {
        Map<Integer, Integer> rezultat = new TreeMap<>(Collections.reverseOrder());
        try {
            start.retrage(suma, rezultat);
            System.out.println("Retragere reusita: " + suma + " RON");
            rezultat.forEach((val, buc) -> System.out.println(buc + " x " + val + " RON"));
        } catch (ExceptieRetragere e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
