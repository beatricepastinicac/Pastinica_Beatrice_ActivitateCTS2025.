public class DecoratorFelicitare implements Nota {
    private Nota nota;
    private Felicitare felicitare;

    public DecoratorFelicitare(Nota nota, Felicitare felicitare) {
        this.nota = nota;
        this.felicitare = felicitare;
    }

    @Override
    public void printeaza() {
        nota.printeaza(); // Printeaza nota
        felicitare.printeazaFelicitare(); // Printeaza felicitarea
    }
}
