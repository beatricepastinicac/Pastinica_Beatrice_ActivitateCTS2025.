public class VerificarePersoanaFacade {
    private VerificatorBilet verificatorBilet;
    private VerificatorPolitie verificatorPolitie;
    private VerificatorAntecedente verificatorAntecedente;

    public VerificarePersoanaFacade() {
        this.verificatorBilet = new VerificatorBilet();
        this.verificatorPolitie = new VerificatorPolitie();
        this.verificatorAntecedente = new VerificatorAntecedente();
    }

    public void verificaPersoana(String seriaBuletin, String codBilet) {
        boolean biletValid = verificatorBilet.verificaBilet(seriaBuletin, codBilet);
        boolean persoanaCautata = verificatorPolitie.verificaPersoana(seriaBuletin);
        boolean antecedente = verificatorAntecedente.verificaAntecedente(seriaBuletin);

        if (biletValid && !persoanaCautata && !antecedente) {
            System.out.println("Persoana poate intra pe stadion.");
        } else {
            System.out.println("Persoana nu poate intra pe stadion.");
        }
    }
}
