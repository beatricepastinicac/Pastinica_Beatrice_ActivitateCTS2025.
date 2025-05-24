package subiecte.d.s10.chainOfResponsability;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = new Magazin();

        magazin.adaugaProdus(new Produs("Pantof A", "negru", 42, "Nike"));
        magazin.adaugaProdus(new Produs("Pantof B", "alb", 40, "Adidas"));
        magazin.adaugaProdus(new Produs("Pantof C", "negru", 40, "Nike"));
        magazin.adaugaProdus(new Produs("Pantof D", "rosu", 42, "Puma"));
        magazin.adaugaProdus(new Produs("Pantof E", "negru", 41, "Adidas"));
        magazin.adaugaProdus(new Produs("Pantof F", "albastru", 42, "Reebok"));
        magazin.adaugaProdus(new Produs("Pantof G", "alb", 42, "Nike"));

        Filtru f1 = new FiltruCuloare("negru");
        Filtru f2 = new FiltruBrand("Nike");
        f1.setUrmator(f2);

        System.out.println("Cautare: produse negre Nike");
        List<Produs> rezultat1 = magazin.cautaProduse(f1);
        rezultat1.forEach(System.out::println);

        Filtru f3 = new FiltruMarime(42);
        System.out.println("\nCautare: marime 42");
        List<Produs> rezultat2 = magazin.cautaProduse(f3);
        rezultat2.forEach(System.out::println);
    }

}
