package subiecte.d.s10.chainOfResponsability;

import java.util.List;
import java.util.stream.Collectors;

public class FiltruBrand extends Filtru {
    private String brand;

    public FiltruBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public List<Produs> aplicaFiltru(List<Produs> produse) {
        List<Produs> filtrate = (brand == null)
                ? produse
                : produse.stream().filter(p -> p.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());

        return (urmator != null) ? urmator.aplicaFiltru(filtrate) : filtrate;
    }
}