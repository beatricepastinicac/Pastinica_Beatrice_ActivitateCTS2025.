public class PersonalSpitalFactory {
    public PersonalSpital crearePersonal(TipPersonal tipPersonal) {
        switch (tipPersonal) {
            case Brancardier:
                return new Brancardier();
            case Asistent:
                return new Asistent();
            case Medic:
                return new Medic();
            default:
                return null;
        }
    }
}
