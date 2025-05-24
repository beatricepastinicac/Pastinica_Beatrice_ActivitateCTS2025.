package subiecte.d.s2.flyweight;

public class Main {
    public static void main(String[] args) {

        FabricaRecomandari fabrica = new FabricaRecomandari();

        String[] mesaje = {
                "Bea 2L apa pe zi.",
                "Evita sarea si zaharul in exces.",
                "Dormi cel putin 7 ore.",
                "Fă miscare zilnica.",
                "Controleaza-ti nivelul de stres."
        };

        Reteta[] retete = new Reteta[10];
        for (int i = 0; i < 10; i++) {
            RecomandareSanatate rec = fabrica.getRecomandare(mesaje[i % mesaje.length]);
            retete[i] = new Reteta("Pacient" + i, "Diagnostic" + i, rec);
            retete[i].printeaza();
        }

        System.out.println("Numar obiecte Recomandare create: " + fabrica.getNrRecomandari());

    }
}