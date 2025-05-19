package adapterPlata;

public class LegacyPaymentAdapter implements PaymentProcesor {
    private LegacyPaymentGateway legacyGateway;
    private String defaultAccount = "COMPANY_ACCOUNT_123";

    public LegacyPaymentAdapter(LegacyPaymentGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public boolean processPayment(double amount){
        System.out.println("[Adapter] Translating modern call to legacy gateway...");
        legacyGateway.makePayment(defaultAccount, amount);
        return  true;
    }
}
