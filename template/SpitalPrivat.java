package subiecte.d.s2.template;

public class SpitalPrivat extends PreluareUrgenta {

    private boolean semneGrave;

    public SpitalPrivat(boolean semneGrave) {
        this.semneGrave = semneGrave;
    }

    @Override
    protected void verificaSemneVitale() {
        System.out.println("Spital privat: Se verifica semnele vitale ale pacientului.");
    }

    @Override
    protected boolean areSemneGrave() {
        return semneGrave;
    }

    @Override
    protected void stabilizare() {
        System.out.println("Spital privat: Se cheama echipa externa pentru stabilizarea pacientului.");
    }

    @Override
    protected void cautaProgramare() {
        System.out.println("Spital privat: Se cauta programare in sistemul medical privat.");
    }

    @Override
    protected void verificaLocuriSpital() {
        System.out.println("Spital privat: Se verifica daca exista locuri disponibile in clinica.");
    }
}
