package tipuriSingletone;

public class SingletoneInnerStaticHelper { // rtetine instanta unica
    private SingletoneInnerStaticHelper(){

    }

    private static class SingletoneHelper{
        private static final SingletoneInnerStaticHelper instance =
                new SingletoneInnerStaticHelper();

    }

    public static SingletoneInnerStaticHelper getInstance(){
        return SingletoneHelper.instance; //returneaza instanta helperului meu
    }

}
