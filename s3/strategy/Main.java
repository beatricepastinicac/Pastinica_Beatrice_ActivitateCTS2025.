package subiecte.d.s3.strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IProdus> produse = List.of(
                new Produs("Laptop", 3500, 2),
                new Produs("Telefon", 2500, 0),
                new Produs("Tastatura", 250, 5)
        );
        Magazin magazin = new Magazin(produse);

        magazin.setStrategie(new VizualizareCrescator());
        System.out.println("Produse crescator:");
        magazin.afiseazaProduse();

        magazin.setStrategie(new VizualizareCuRecenzii());
        System.out.println("Produse cu recenzii:");
        magazin.afiseazaProduse();


    }
}
