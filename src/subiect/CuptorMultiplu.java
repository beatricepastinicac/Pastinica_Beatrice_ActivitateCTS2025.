package subiect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuptorMultiplu {
    //getsionare pt crearea a 4 cuptoare - am nev de bloc static nu ma ajuta getInstance
    private static Map<Integer, CuptorMultiplu> instances;
    private int gradeMaxim;
    private List<Preparat> listAsteptare = null;
    private  int id;

    static{
        instances=new HashMap<Integer, CuptorMultiplu>();
        //simulam preluarea din fisier
        instances.put(1, new CuptorMultiplu(1, 280));
        instances.put(2, new CuptorMultiplu(1, 280));
        instances.put(3, new CuptorMultiplu(1, 280));
        instances.put(4, new CuptorMultiplu(1, 280));

    }

    private CuptorMultiplu(int id, int gradeMaxim){
        this.id=id;
        this.gradeMaxim=gradeMaxim;
        this.listAsteptare=new ArrayList<>();

    }

    public int timpAsteptare(){
        int total=0;
        for(Preparat p:this.listAsteptare){
            total+=p.getNrMinutePreparare();
        }
        return total;
    }

    public static void addPreparat(Preparat p){
        //decid carui cuptor adaug
        int timpMin=
    }




}
