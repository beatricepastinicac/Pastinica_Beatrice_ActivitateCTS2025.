package tipuriSingletone;

public class SingletoneThreadSafe {
    private static SingletoneThreadSafe instance;

    private SingletoneThreadSafe(){

    }

    public static synchronized SingletoneThreadSafe getInstance(){ //synchronized !!!
        if(instance == null)
            instance = new SingletoneThreadSafe();
        return instance;
    }

}
