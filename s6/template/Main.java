package subiecte.d.s6.template;

public class Main {
        public static void main(String[] args) {
            AbstractVotare tara = new VotareInTara();
            AbstractVotare strainatate = new VotareInStrainatate();

            System.out.println(" VOT IN TARA ");
            tara.proceseazaAlegator("RO-01-CJ");

            System.out.println(" VOT IN STRAINATATE ");
            strainatate.proceseazaAlegator("ambasada Madrid");

            System.out.println(" VOT CU ADRESA INVALIDA ");
            tara.proceseazaAlegator("UK");
        }

}
