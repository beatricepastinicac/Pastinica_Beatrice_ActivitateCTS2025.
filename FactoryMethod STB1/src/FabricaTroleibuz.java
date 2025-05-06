public class FabricaTroleibuz implements FabricaMijlocTransport {
    @Override
    public MijlocTransport creazaMijlocTransport() {
        return new Troleibuz();
    }
}
