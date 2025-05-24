package tipuriSingletone;

public class SingletoneEager {
    private static final SingletoneEager instance = new SingletoneEager(); //la declarare se apeleaza constructorul
 //
    private SingletoneEager(){ //constructor privat

    }

    public static SingletoneEager getInstance(){
        //instance = new SingletonEager(); - !!!! nu putem face asta deoarece avem final
        return instance;
    }

}
