package subiecte.d.s10.chainOfResponsability;

import java.util.List;
import java.util.stream.Collectors;

public class FiltruMarime extends Filtru {
    private Integer marime;

    public FiltruMarime(Integer marime) {
        this.marime = marime;
    }

    @Override
    public List<Produs> aplicaFiltru(List<Produs> produse) {
        List<Produs> filtrate = (marime == null)
                ? produse
                : produse.stream().filter(p -> p.getMarime() == marime).collect(Collectors.toList());

        return (urmator != null) ? urmator.aplicaFiltru(filtrate) : filtrate;
    }
}