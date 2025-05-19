package adapterPlata;

public class AdapterDemoComplex {
    public static void main(String[] args) {

        LegacyPaymentGateway legacy = new LegacyPaymentGateway();
        PaymentProcesor adapter = new LegacyPaymentAdapter(legacy);

        CheckoutService service = new CheckoutService(adapter);
        service.checkout(249.99);
    }
}