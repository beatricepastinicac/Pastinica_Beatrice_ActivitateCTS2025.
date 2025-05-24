package subiecte.d.s5.proxy;

public class Spital implements ISpital {
    public void permiteAcces(Vizitator vizitator) {
        System.out.println("Acces permis pentru " + vizitator.getNume() +
                " la pacientul " + vizitator.getPacientVizitat());
    }
}
