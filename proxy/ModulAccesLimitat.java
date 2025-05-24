package subiecte.d.s5.proxy;

import java.util.*;

public class ModulAccesLimitat implements ISpital {
    private ISpital spital;
    private Set<String> pacientiVizitatiAstazi;

    public ModulAccesLimitat(ISpital spital) {
        this.spital = spital;
        this.pacientiVizitatiAstazi = new HashSet<>();
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        String pacient = vizitator.getPacientVizitat();
        if (pacientiVizitatiAstazi.contains(pacient)) {
            System.out.println("Acces interzis pentru " + vizitator.getNume() +
                    ". Pacientul " + pacient + " a fost deja vizitat azi.");
        } else {
            pacientiVizitatiAstazi.add(pacient);
            spital.permiteAcces(vizitator);
        }
    }

    public void resetareZi() {
        System.out.println("\nResetare vizite pentru o noua zi.");
        pacientiVizitatiAstazi.clear();
    }
}
