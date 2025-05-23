package subiecte.d.s7.decorator;

public class Main {
    public static void main(String[] args) {
        IComanda magazin = new Magazin();
        IComanda magazinCuPromo = new MagazinCuDiscount(magazin);

        Client ana = new Client("Ana");
        Client radu = new Client("Radu");

        magazinCuPromo.plaseazaComanda(ana, 100, "Bucuresti");
        magazinCuPromo.plaseazaComanda(ana, 150, "Bucuresti");

        magazinCuPromo.plaseazaComanda(radu, 200, "Cluj");
        magazinCuPromo.plaseazaComanda(radu, 120, "Cluj");
        magazinCuPromo.plaseazaComanda(radu, 300, "Cluj");
    }
}
