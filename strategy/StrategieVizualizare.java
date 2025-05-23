package subiecte.d.s3.strategy;

import java.util.List;

public interface StrategieVizualizare {
    List<IProdus> aplicaStrategie(List<IProdus> produse);
}