package s1.proxy;

public class Spital implements ISpital {
    @Override
    public void permiteAcces(Vizitator vizitator){
        System.out.println("Vizitatorul: "+vizitator.getNume()+" a fost primit ]n salon.");
    }
}
