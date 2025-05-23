package subiecte.d.s7.composite;

public class Main {
    public static void main(String[] args) {
        Produs laptop = new Produs("Laptop HP", 10);
        Produs mouse = new Produs("Mouse Logitech", 30);
        Produs tastatura = new Produs("Tastatura mecanica", 15);

        Categorie periferice = new Categorie("Periferice");
        periferice.adauga(mouse);
        periferice.adauga(tastatura);

        Categorie it = new Categorie("IT");
        it.adauga(laptop);
        it.adauga(periferice);

        Categorie magazin = new Categorie("Magazin Online");
        magazin.adauga(it);

        magazin.afiseaza("");
    }
}
