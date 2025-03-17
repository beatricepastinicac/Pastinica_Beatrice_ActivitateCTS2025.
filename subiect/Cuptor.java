package subiect;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor instance = null;
    private List<Preparat> listaAsteptare = null;

    private Cuptor(){
        this.listaAsteptare= new ArrayList<>();

    }
    //lazy
    public static Cuptor getInstance(){
        if(instance == null){
            instance = new Cuptor();
        }
        return instance;
    }

    public void addPreparat(Preparat p){
        if(p!=null){
            this.listaAsteptare.add(p);
        }
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("listaAsteptare=").append(listaAsteptare);
        sb.append('}');
        return sb.toString();
    }


}
