package subiecte.d.s2.template;

public class SpitalPublic extends PreluareUrgenta {

    private boolean semneGrave;

    public SpitalPublic(boolean semneGrave) {
        this.semneGrave = semneGrave;
    }

    @Override
    protected void verificaSemneVitale() {
        System.out.println("Spital public: Se verifică semnele vitale ale pacientului.");
    }

    @Override
    protected boolean areSemneGrave() {
        return semneGrave;
    }

    @Override
    protected void stabilizare() {
        System.out.println("Spital public: Se cheamă echipa internă de stabilizare.");
    }

    @Override
    protected void cautaProgramare() {
        System.out.println("Spital public: Se caută cea mai apropiată programare la medicul de familie.");
    }

    @Override
    protected void verificaLocuriSpital() {
        System.out.println("Spital public: Se verifică dacă există locuri disponibile.");
        System.out.println("Spital public: Dacă nu sunt locuri, se caută în spitalele apropiate.");
    }
}
