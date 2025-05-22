package s1.proxy;

public class Main {
    public static void main(String[] args){

        ISpital spital = new Spital();
        ModulAccesSpital proxy = new ModulAccesSpital(spital);

        Vizitator[] vizitatori={
                new Vizitator("Andrei", true),
        new Vizitator("Maria", true),
                new Vizitator("Ion", true),
                new Vizitator("Lavinia", false), // făra scrisoare
                new Vizitator("George", true),
                new Vizitator("Elena", true),
                new Vizitator("Radu", true)
        };

        for (Vizitator v : vizitatori) {
            proxy.permiteAcces(v);

        }
    }
}

