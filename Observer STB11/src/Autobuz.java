import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subject {
    private List<Observer> calatori = new ArrayList<>();

    public void adaugaCalator(Calator calator) {
        calatori.add(calator);
    }

    public void removeObserver(Calator calator) {
        calatori.remove(calator);
    }

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers(String message) {
        for (Observer calator : calatori) {
            calator.update(message);
        }
    }

    public void pleacaDeLaCapatDeLinie() {
        notifyObservers("Autobuzul a plecat de la capăt de linie.");
    }
}
