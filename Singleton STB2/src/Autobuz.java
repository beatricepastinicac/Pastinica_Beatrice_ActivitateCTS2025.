public class Autobuz implements MijlocTransport {
    private static Autobuz instance;

    private Autobuz() {}

    public static Autobuz getInstance() {
        if (instance == null) {
            instance = new Autobuz();
        }
        return instance;
    }

    @Override
    public void transporta() {
        System.out.println("Autobuzul transportă pasageri.");
    }
}
