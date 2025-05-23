package subiecte.d.s6.template;

public class VotareInTara extends AbstractVotare {
    @Override
    protected void verificaBuletin() {
        System.out.println("Verificare buletin national...");
    }

    @Override
    protected boolean verificaAdresa(String adresa) {
        return adresa.startsWith("RO-");
    }

    @Override
    protected void emiteBuletinNormal() {
        System.out.println("Buletin de vot national emis.");
    }

    @Override
    protected void emiteBuletinLS() {
        System.out.println("Buletin LS emis pentru alta sectie.");
    }

    @Override
    protected void finalizeazaVot() {
        System.out.println("Alegatorul a votat in tara.\n");
    }
}
