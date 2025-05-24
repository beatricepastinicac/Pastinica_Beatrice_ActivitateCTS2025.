package subiecte.d.s10.strategy;

import java.util.Map;

public class Client implements IClient {
    private String nume;
    private ICautare strategie;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void seteazaStrategieCautare(ICautare strategie) {
        this.strategie = strategie;
    }

    @Override
    public void cautaProduse() {
        if (strategie == null) {
            System.out.println("Nicio strategie de cautare setata.");
            return;
        }

        System.out.println(nume + " a generat urmatoarele criterii:");
        Map<String, Object> criterii = strategie.genereazaCriterii();
        criterii.forEach((k, v) -> System.out.println(" - " + k + ": " + v));
    }
}
