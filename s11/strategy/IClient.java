package subiecte.d.s11.strategy;

import subiecte.d.s11.chainOfResponsability.Bancnota;

public interface IClient {
    void seteazaStrategie(IStrategieRetragere strategie);
    void retrage(int suma, Bancnota b50, Bancnota b20, Bancnota b10);
}