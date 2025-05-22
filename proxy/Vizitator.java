package s1.proxy;

public class Vizitator {
    private String nume;
    private boolean areScrisoare;
    private boolean esteEchipat;

    public Vizitator(String nume, boolean areScrisoare){
        this.nume=nume;
        this.areScrisoare=areScrisoare;
        this.esteEchipat=false;
    }

    public String getNume(){
        return nume;
    }

    public boolean areScrisoare(){
        return areScrisoare;
    }

    public boolean EsteEchipat(){
        return esteEchipat;
    }

    public void setEchipat(boolean esteEchipat){
        this.esteEchipat=esteEchipat;
    }
}
