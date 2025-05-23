package subiecte.d.s6.template;

public class VotareInStrainatate extends AbstractVotare {
    @Override
    protected void verificaBuletin() {
        System.out.println("Verificare pasaport / CI...");
    }

    @Override
    protected boolean verificaAdresa(String adresa) {
        return adresa.contains("ambasada");
    }

    @Override
    protected void emiteBuletinNormal() {
        System.out.println("Buletin de vot strainatate emis.");
    }

    @Override
    protected void emiteBuletinLS() {
        System.out.println("Buletin LS emis - lista suplimentara strainatate.");
    }

    @Override
    protected void finalizeazaVot() {
        System.out.println("Alegatorul a votat in strainatate.\n");
    }
}
