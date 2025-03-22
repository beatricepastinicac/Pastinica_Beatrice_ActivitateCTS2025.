import java.util.EnumSet;

public class SalaConferintaBuilder implements  IBuilder{
    private SalaConferinta salaConferinta;
    ;

    public SalaConferintaBuilder() {
        salaConferinta = new SalaConferinta();
    }

    public SalaConferintaBuilder setNume(String nume){
        salaConferinta.setNume(nume);
        return this;
    }

    public SalaConferintaBuilder setCapacitateMax(int capacitateMax){
        salaConferinta.setCapacitateMax(capacitateMax);
        return this;
    }

    public SalaConferintaBuilder setDotariSuplimentare(DotariSuplimentare dotariSuplimentare){
        salaConferinta.setDotariSuplimentare(dotariSuplimentare);
        return this;
    }

    @Override
    public SalaConferinta build() {
        return salaConferinta;
    }
}
