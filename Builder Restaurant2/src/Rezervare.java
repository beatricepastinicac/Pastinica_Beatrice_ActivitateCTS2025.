public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    private Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareMasa,
                      boolean muzicaAmbientalaPersonalizata, String genMuzica) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return muzicaAmbientalaPersonalizata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public static class RezervareBuilderImpl implements RezervareBuilder {
        private boolean asezareLaGeam;
        private boolean scauneErgonomice;
        private boolean decorareMasa;
        private boolean muzicaAmbientalaPersonalizata;
        private String genMuzica;

        @Override
        public Rezervare build() {
            return new Rezervare(asezareLaGeam, scauneErgonomice, decorareMasa,
                    muzicaAmbientalaPersonalizata, genMuzica);
        }

        @Override
        public RezervareBuilder asezareLaGeam(boolean asezareLaGeam) {
            this.asezareLaGeam = asezareLaGeam;
            return this;
        }

        @Override
        public RezervareBuilder scauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        @Override
        public RezervareBuilder decorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        @Override
        public RezervareBuilder muzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        @Override
        public RezervareBuilder genMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }
    }
}
