public class FabricaTramvai implements FabricaMijlocTransport {
    @Override
    public MijlocTransport creazaMijlocTransport() {
        return new Tramvai();
    }
}
