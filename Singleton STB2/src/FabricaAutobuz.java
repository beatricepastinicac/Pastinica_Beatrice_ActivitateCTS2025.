public class FabricaAutobuz implements FabricaMijlocTransport {
    @Override
    public MijlocTransport creazaMijlocTransport() {
        return Autobuz.getInstance();
    }
}
