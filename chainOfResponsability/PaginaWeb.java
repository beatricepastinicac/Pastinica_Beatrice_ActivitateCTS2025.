package subiecte.d.s3.chainOfResponsability;

import java.util.*;

public class PaginaWeb {
    private List<Item> iteme;

    public PaginaWeb(List<Item> iteme) {
        this.iteme = iteme;
    }

    public List<Item> getIteme() {
        return iteme;
    }

    public void afiseaza() {
        iteme.forEach(System.out::println);
    }
}