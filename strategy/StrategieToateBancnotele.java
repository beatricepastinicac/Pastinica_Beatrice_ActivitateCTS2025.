package subiecte.d.s11.strategy;

import subiecte.d.s11.chainOfResponsability.*;

public class StrategieToateBancnotele implements IStrategieRetragere {
    public HandlerBancnote configureazaLant(Bancnota b50, Bancnota b20, Bancnota b10) {
        HandlerBancnote h50 = new HandlerBancnota50(b50);
        HandlerBancnote h20 = new HandlerBancnota20(b20);
        HandlerBancnote h10 = new HandlerBancnota10(b10);

        h50.setUrmator(h20);
        h20.setUrmator(h10);

        return h50;
    }
}
