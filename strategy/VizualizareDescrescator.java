package subiecte.d.s3.strategy;

import java.util.*;
import java.util.stream.Collectors;

public class VizualizareDescrescator implements StrategieVizualizare {
    public List<IProdus> aplicaStrategie(List<IProdus> produse) {
        return produse.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPret(), p1.getPret()))
                .collect(Collectors.toList());
    }
}