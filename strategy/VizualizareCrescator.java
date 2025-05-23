package subiecte.d.s3.strategy;

import java.util.*;
import java.util.stream.Collectors;

public class VizualizareCrescator implements StrategieVizualizare {
    public List<IProdus> aplicaStrategie(List<IProdus> produse) {
        return produse.stream()
                .sorted(Comparator.comparingDouble(IProdus::getPret))
                .collect(Collectors.toList());
    }
}
