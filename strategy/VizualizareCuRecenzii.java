package subiecte.d.s3.strategy;

import java.util.*;
import java.util.stream.Collectors;

public class VizualizareCuRecenzii implements StrategieVizualizare {
    public List<IProdus> aplicaStrategie(List<IProdus> produse) {
        return produse.stream()
                .filter(p -> p.getNrRecenzii() > 0)
                .collect(Collectors.toList());
    }
}
