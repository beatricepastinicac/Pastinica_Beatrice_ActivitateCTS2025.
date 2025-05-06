public class Main {
    public static void main(String[] args) {
        FabricaMijlocTransport fabricaAutobuz = new FabricaAutobuz();
        MijlocTransport autobuz = fabricaAutobuz.creazaMijlocTransport();

        autobuz.transporta();

    }
}
