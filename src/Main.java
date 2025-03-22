public class Main {
    public static void main(String[] args) {

        SalaConferinta sala = new SalaConferinta();
        sala.setDotariSuplimentare(DotariSuplimentare.priza);
        sala.setDotariSuplimentare(DotariSuplimentare.sistem_audio);
        sala.setDotariSuplimentare(DotariSuplimentare.proiector);
        sala.setDotariSuplimentare(DotariSuplimentare.internet_rapid);

        sala.setNume("conf1");

        sala.setCapacitateMax(60);
        sala.setCapacitateMax(800);

        System.out.println(sala.toString());

        SalaConferinta sala2 =new SalaConferintaBuilder().setNume("conf2").setCapacitateMax(100).setDotariSuplimentare(DotariSuplimentare.internet_rapid).build();
        System.out.println(sala2.toString());
    }
}