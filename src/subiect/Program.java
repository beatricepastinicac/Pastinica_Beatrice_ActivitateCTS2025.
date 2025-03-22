package subiect;

public class Program {
    public static void main(String[] args) {

        Preparat p1=new Preparat("paine", 45, 270);
        Preparat p2=new Preparat("pizza", 15, 250);
        Preparat p3= new Preparat("friptura", 20, 210);

        Cuptor.getInstance().addPreparat(p1);
        Cuptor.getInstance().addPreparat(p2);
        Cuptor.getInstance().addPreparat(p3);

        System.out.println(Cuptor.getInstance());

    }
}