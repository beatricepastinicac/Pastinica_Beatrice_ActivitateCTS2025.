public class Main {
    public static void main(String[] args) {
        Nota notaDePlataSimpla = new NotaDePlata();

        Felicitare felicitare = new FelicitareSarbatori();
        Nota notaCuFelicitare = new DecoratorFelicitare(notaDePlataSimpla, felicitare);

        notaCuFelicitare.printeaza();
    }
}
