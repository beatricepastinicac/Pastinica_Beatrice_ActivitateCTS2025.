public interface RezervareBuilder {
    Rezervare build();
    RezervareBuilder asezareLaGeam(boolean asezareLaGeam);
    RezervareBuilder scauneErgonomice(boolean scauneErgonomice);
    RezervareBuilder decorareMasa(boolean decorareMasa);
    RezervareBuilder muzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata);
    RezervareBuilder genMuzica(String genMuzica);
}
