package subiecte.d.s8.strategy;

public class PlataCard implements StrategiePlata {
    public void plateste(String client, double suma) {
        System.out.println(client + " a platit " + suma + " RON prin card bancar.");
    }
}
