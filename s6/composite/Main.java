package subiecte.d.s6.composite;

public class Main {
    public static void main(String[] args) {
        SectieVot s1 = new SectieVot("Sectie 1", 100, 80);
        SectieVot s2 = new SectieVot("Sectie 2", 45, 60);
        SectieVot s3 = new SectieVot("Sectie 3", 90, 20);
        SectieVot s4 = new SectieVot("Sectie 4", 50, 50);

        Judet j1 = new Judet("Cluj");
        j1.adaugaSectie(s1);
        j1.adaugaSectie(s2);

        Judet j2 = new Judet("Iasi");
        j2.adaugaSectie(s3);
        j2.adaugaSectie(s4);

        ReferendumNational ref = new ReferendumNational();
        ref.adaugaJudet(j1);
        ref.adaugaJudet(j2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(j1);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(j2);
        System.out.println(ref);
    }
}
