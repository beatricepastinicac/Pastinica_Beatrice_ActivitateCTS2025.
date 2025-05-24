package subiecte.d.s3.chainOfResponsability;

import java.util.Iterator;

public class FiltruImagine extends Filtru {
    public void aplica(PaginaWeb pagina) {
        Iterator<Item> it = pagina.getIteme().iterator();
        while (it.hasNext()) {
            if (it.next().getTip() == Item.Tip.IMAGINE) {
                it.remove();
            }
        }
        if (urmator != null) urmator.aplica(pagina);
    }
}
