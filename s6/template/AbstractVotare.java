package subiecte.d.s6.template;

public abstract class AbstractVotare {
    public final void proceseazaAlegator(String adresa) {
        verificaBuletin();
        if (!verificaAdresa(adresa)) {
            emiteBuletinLS();
        } else {
            emiteBuletinNormal();
        }
        finalizeazaVot();
    }

    protected abstract void verificaBuletin();
    protected abstract boolean verificaAdresa(String adresa);
    protected abstract void emiteBuletinNormal();
    protected abstract void emiteBuletinLS();
    protected abstract void finalizeazaVot();
}
