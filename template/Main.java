package subiecte.d.s2.template;

public class Main {
    public static void main(String[] args) {
        PreluareUrgenta publicCase = new SpitalPublic(true);
        PreluareUrgenta privatCase = new SpitalPrivat(false);
        publicCase.gestioneazaCaz();
        System.out.println();
        privatCase.gestioneazaCaz();

    }
}
