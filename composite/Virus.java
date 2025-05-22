package s1.composite;

public interface Virus {
    void adauga(Virus v);
    void sterge(Virus v);
    void afiseazaStructura(String indentare);
    int getNrCazuri();
}
