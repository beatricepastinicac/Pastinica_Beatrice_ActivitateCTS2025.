public class Main {
    public static void main(String[] args) {
        PersonalSpitalFactory factory = new PersonalSpitalFactory();

        PersonalSpital brancardier = factory.crearePersonal(TipPersonal.Brancardier);
        PersonalSpital asistent = factory.crearePersonal(TipPersonal.Asistent);
        PersonalSpital medic = factory.crearePersonal(TipPersonal.Medic);

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();
    }
}
