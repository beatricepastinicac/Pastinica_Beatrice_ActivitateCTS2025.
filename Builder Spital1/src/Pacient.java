public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    private Pacient(PacientBuilder builder) {
        this.nume = builder.nume;
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciDeCamera = builder.papuciDeCamera;
        this.halatPentruInterior = builder.halatPentruInterior;
    }

    public String getNume() {
        return nume;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

    public boolean isHalatPentruInterior() {
        return halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }

    public static class PacientBuilder implements Builder<Pacient> {
        private String nume;
        private boolean patRabatabil = false;
        private boolean micDejunInclus = false;
        private boolean papuciDeCamera = false;
        private boolean halatPentruInterior = false;

        public PacientBuilder(String nume) {
            this.nume = nume;
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
            this.papuciDeCamera = papuciDeCamera;
            return this;
        }

        public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
            this.halatPentruInterior = halatPentruInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(this);
        }
    }
}
