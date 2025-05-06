public class Main {
    public static void main(String[] args) {
        FabricaMijlocTransport fabricaAutobuz = new FabricaAutobuz();
        FabricaMijlocTransport fabricaTramvai = new FabricaTramvai();
        FabricaMijlocTransport fabricaTroleibuz = new FabricaTroleibuz();

        MijlocTransport autobuz = fabricaAutobuz.creazaMijlocTransport();
        MijlocTransport tramvai = fabricaTramvai.creazaMijlocTransport();
        MijlocTransport troleibuz = fabricaTroleibuz.creazaMijlocTransport();

        autobuz.transporta();
        tramvai.transporta();
        troleibuz.transporta();
    }
}
