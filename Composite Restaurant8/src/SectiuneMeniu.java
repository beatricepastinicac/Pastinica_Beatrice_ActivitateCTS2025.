import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu extends ElementMeniu {
    private List<ComponentaMeniu> elemente = new ArrayList<>();

    public SectiuneMeniu(String nume) {
        super(nume);
    }

    public void adauga(ComponentaMeniu element) {
        elemente.add(element);
    }

    public void sterge(ComponentaMeniu element) {
        elemente.remove(element);
    }

    @Override
    public void afisare() {
        System.out.println("Sectiune: " + nume);
        for (ComponentaMeniu element : elemente) {
            element.afisare();
        }
    }
}
