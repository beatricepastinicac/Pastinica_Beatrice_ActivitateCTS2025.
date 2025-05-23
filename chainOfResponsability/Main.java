package subiecte.d.s3.chainOfResponsability;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaginaWeb pagina1 = new PaginaWeb(new ArrayList<>(List.of(
                new Item(Item.Tip.PARAGRAF, "Salut lume", true, true, "rosu"),
                new Item(Item.Tip.IMAGINE, "banner.jpg", false, false, "n/a")
        )));

        Filtru f1 = new FiltruImagine();
        Filtru f2 = new FiltruParagraf();
        f1.setUrmator(f2);

        System.out.println("Pagina inainte:");
        pagina1.afiseaza();

        f1.aplica(pagina1);

        System.out.println("Pagina dupa filtrare:");
        pagina1.afiseaza();

    }
}
