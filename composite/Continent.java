package subiecte.d.s1.composite;

import java.util.ArrayList;
import java.util.List;

public class Continent implements  Virus{
    private String nume;
    private List<Virus> tari=new ArrayList<>();

    public Continent(String nume){
        this.nume=nume;
    }

    @Override
    public void adauga(Virus v) {
        tari.add(v);
    }

    @Override
    public void sterge(Virus v) {
tari.remove(v);
    }

    @Override
    public void afiseazaStructura(String indentare) {
System.out.println(indentare+">> Continent: "+ nume);
for(Virus v: tari){
    v.afiseazaStructura(indentare+ " ");
}
    }

    @Override
    public int getNrCazuri() {
        int total=0;
        for(Virus v: tari){
            total+=v.getNrCazuri();
        }
        return total;
    }
}
