package subiecte.d.s1.composite;

import java.util.ArrayList;
import java.util.List;

public class Tara implements Virus{
    private String nume;
    private List<Virus> tulpini = new ArrayList<>();

    public Tara(String nume){
        this.nume=nume;
    }

    @Override
    public void adauga(Virus v){
        tulpini.add(v);
    }

    @Override
    public void sterge(Virus v){
        tulpini.remove(v);
    }

    @Override
    public void afiseazaStructura(String indentare){
        System.out.println(indentare+ "> Tara: "+nume);
        for (Virus v: tulpini){
            v.afiseazaStructura(indentare+ " ");
        }
    }

    @Override
    public int getNrCazuri(){
        int total = 0;
        for(Virus v: tulpini){
            total += v.getNrCazuri();
        }
        return total;
    }


}
