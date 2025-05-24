package subiecte.d.s11.chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Bancnota b50 = new Bancnota(50, 4);
        Bancnota b20 = new Bancnota(20, 5);
        Bancnota b10 = new Bancnota(10, 10);

        HandlerBancnote h50 = new HandlerBancnota50(b50);
        HandlerBancnote h20 = new HandlerBancnota20(b20);
        HandlerBancnote h10 = new HandlerBancnota10(b10);

        h50.setUrmator(h20);
        h20.setUrmator(h10);

        Bancomat bancomat = new Bancomat();
        bancomat.seteazaLant(h50);

        System.out.println("Retragere 130 RON:");
        bancomat.retrage(130);

        System.out.println("\nRetragere 125 RON (nu poate fi compusa):");
        bancomat.retrage(125);
    }
}
