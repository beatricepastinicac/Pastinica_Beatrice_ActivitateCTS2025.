package subiecte.d.s3.chainOfResponsability;

public class FiltruParagraf extends Filtru {
    public void aplica(PaginaWeb pagina) {
        for (Item item : pagina.getIteme()) {
            if (item.getTip() == Item.Tip.PARAGRAF) {
                item.simplificaParagraf();
            }
        }
        if (urmator != null) urmator.aplica(pagina);
    }
}
