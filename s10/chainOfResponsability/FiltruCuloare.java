package subiecte.d.s10.chainOfResponsability;

import java.util.List;
import java.util.stream.Collectors;

public class FiltruCuloare extends Filtru {
    private String culoare;

    public FiltruCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public List<Produs> aplicaFiltru(List<Produs> produse) {
        List<Produs> filtrate = (culoare == null)
                ? produse
                : produse.stream().filter(p -> p.getCuloare().equalsIgnoreCase(culoare)).collect(Collectors.toList());

        return (urmator != null) ? urmator.aplicaFiltru(filtrate) : filtrate;
    }
}