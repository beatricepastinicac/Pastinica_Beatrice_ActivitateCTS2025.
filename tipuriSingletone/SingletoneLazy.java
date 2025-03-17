package tipuriSingletone;

public class SingletoneLazy {
    private static SingletoneLazy instance;

    private SingletoneLazy(){ //constructorii PRIVATE

    }

    //SABLON

    public static SingletoneLazy getInstance() { // metoda statica publica, - daca nu ar fi static nu am putea crea obiecte
        // verifica daca instata e null => nu a mai fost aplelata, nu exista obiect =>
        // construieste obiect

        if (instance == null)
            instance = new SingletoneLazy();

        return instance; //returneaza obiect 1
    }
}

//obiectul se construieste la cerere = LAZY
