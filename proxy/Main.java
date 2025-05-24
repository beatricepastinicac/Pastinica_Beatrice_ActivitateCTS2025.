package subiecte.d.s5.proxy;

public class Main {
    public static void main(String[] args) {
        ISpital spital = new Spital();
        ModulAccesLimitat proxy = new ModulAccesLimitat(spital);

        Vizitator v1 = new Vizitator("Andrei", "Ion Popescu");
        Vizitator v2 = new Vizitator("Maria", "Ion Popescu");
        Vizitator v3 = new Vizitator("Elena", "Ana Georgescu");
        Vizitator v4 = new Vizitator("Radu", "Ana Georgescu");
        Vizitator v5 = new Vizitator("Ioana", "Mihai Vasile");

        proxy.permiteAcces(v1);
        proxy.permiteAcces(v2);
        proxy.permiteAcces(v3);
        proxy.permiteAcces(v4);
        proxy.permiteAcces(v5);

        proxy.resetareZi();

        proxy.permiteAcces(v2);
    }
}
