package subiecte.d.s11.strategy;

import subiecte.d.s11.chainOfResponsability.Bancnota;
import subiecte.d.s11.chainOfResponsability.HandlerBancnote;

public interface IStrategieRetragere {
    HandlerBancnote configureazaLant(Bancnota b50, Bancnota b20, Bancnota b10);
}
