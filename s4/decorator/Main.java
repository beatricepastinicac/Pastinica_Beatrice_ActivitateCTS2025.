package subiecte.d.s4.decorator;

public class Main {
    public static void main(String[] args) {
        IProdus pizza = new ProdusDeBaza("Pizza Margherita", 30);
        IProdus pasta = new ProdusDeBaza("Pasta Carbonara", 28);
        IProdus sandwich = new ProdusDeBaza("Sandwich", 15);
        IProdus supa = new ProdusDeBaza("Supa crema de legume", 18);

        IProdus pizzaItaliana = new Italienesc(pizza);
        IProdus pastaSpaniola = new Spaniol(pasta);

        System.out.println(pizza.getDescriere() + " - " + pizza.getPret() + " RON");
        System.out.println(pizzaItaliana.getDescriere() + " - " + pizzaItaliana.getPret() + " RON");
        System.out.println(pastaSpaniola.getDescriere() + " - " + pastaSpaniola.getPret() + " RON");
        System.out.println(sandwich.getDescriere() + " - " + sandwich.getPret() + " RON");
        System.out.println(supa.getDescriere() + " - " + supa.getPret() + " RON");
    }
}
