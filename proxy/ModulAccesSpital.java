package subiecte.d.s1.proxy;

import java.util.ArrayList;
import java.util.List;

public class ModulAccesSpital implements  ISpital{
    private ISpital spital;
    private List<Vizitator> salaAsteptare;

    public ModulAccesSpital(ISpital spital){
        this.spital=spital;
        this.salaAsteptare=new ArrayList<>();
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        if (!vizitator.areScrisoare()) {
            System.out.println("Acces interzis pentru " + vizitator.getNume() + " lipsa scrisoare medicala.");
            return;
        }

        salaAsteptare.add(vizitator);
        System.out.println("Vizitatorul " + vizitator.getNume() + " a fost adaugat in sala de asteptare.");

        if (salaAsteptare.size() >= 5)
            System.out.println("\n  --- Sala are 5 vizitatori. Incep echiparea... ---");
        for (Vizitator v : salaAsteptare) {
            v.setEchipat(true);
            spital.permiteAcces(v);
        }
        salaAsteptare.clear();
        System.out.println("Toti vizitatori au fost echipati si au intrat in saloane.");
    }

}

