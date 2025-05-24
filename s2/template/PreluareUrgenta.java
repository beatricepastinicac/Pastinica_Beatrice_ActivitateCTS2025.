package subiecte.d.s2.template;

public abstract class PreluareUrgenta {

    public final void gestioneazaCaz() {
        verificaSemneVitale();
        if (areSemneGrave()) {
            stabilizare();
        } else {
            cautaProgramare();
        }
        verificaLocuriSpital();
    }

    protected abstract void verificaSemneVitale();
    protected abstract boolean areSemneGrave();
    protected abstract void stabilizare();
    protected abstract void cautaProgramare();
    protected abstract void verificaLocuriSpital();
}
